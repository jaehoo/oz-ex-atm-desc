package com.oz.atm.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.swing.JMenu;
import java.awt.Component;
import java.awt.Container;
import java.awt.Window;
import java.util.Arrays;
import java.util.Objects;

/**
 * @author José Alberto Sánchez González
 * Twitter: <a href="https://twitter.com/jaehoox">@jaehoox</a>
 * <p>
 * @see <a href="https://www.infoworld.com/article/2073056/automate-gui-tests-for-swing-applications.html>Swing gui tests</a>
 * Created on 18/5/2022 20:52
 **/
public class SwingTestUtils {

	private static final Logger log= LoggerFactory.getLogger(SwingTestUtils.class);

	static int counter;

	public static <T extends Component> T getChildNamed(Component parent, String name) {

		log.debug("Class: {}, Name: {}", parent.getClass(), parent.getName());

		if (name.equals(parent.getName())) { return (T) parent;}
		if (parent instanceof Container) {
			Component[] children = ((Container)parent).getComponents();

			return Arrays.stream(children).<T>map(e -> getChildNamed(e, name))
					.filter(Objects::nonNull).findFirst().orElse(null);
		}

		return null;
	}

	public static Component getChildIndexed(
			Component parent, String klass, int index) {
		counter = 0;
		// Step in only owned windows and ignore its components in JFrame
		if (parent instanceof Window) {
			Component[] children = ((Window)parent).getOwnedWindows();
			for (int i = 0; i < children.length; ++i) {
				// Take only active windows
				if (children[i] instanceof Window &&
						!((Window)children[i]).isActive()) { continue; }
				Component child = getChildIndexedInternal(
						children[i], klass, index);
				if (child != null) { return child; }
			}
		}
		return null;
	}
	private static Component getChildIndexedInternal(
			Component parent, String klass, int index) {

		log.debug("Class: {}, Name: {}", parent.getClass(), parent.getName());

		if (parent.getClass().toString().endsWith(klass)) {
			if (counter == index) { return parent; }
			++counter;
		}
		if (parent instanceof Container) {
			Component[] children = (parent instanceof JMenu) ?
					((JMenu)parent).getMenuComponents() :
					((Container)parent).getComponents();
			for (int i = 0; i < children.length; ++i) {
				Component child = getChildIndexedInternal(
						children[i], klass, index);
				if (child != null) { return child; }
			}
		}

		return null;
	}
}
