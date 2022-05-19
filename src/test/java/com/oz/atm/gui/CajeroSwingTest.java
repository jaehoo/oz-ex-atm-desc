package com.oz.atm.gui;

import com.oz.atm.util.AbstractTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import javax.annotation.Resource;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;

import java.awt.*;
import java.util.Arrays;

import static com.oz.atm.util.SwingTestUtils.getChildNamed;

/**
 * @author José Alberto Sánchez González
 * Twitter: <a href="https://twitter.com/jaehoox">@jaehoox</a>
 * <p>
 * Created on 18/5/2022 21:08
 **/
public class CajeroSwingTest extends AbstractTest {

	@Resource(name = "cajeroSwing")
	private CajeroSwing atm;

	@Test
	public void testGui() {

		JFormattedTextField amountField =getChildNamed(atm,"famount");
		JFormattedTextField clientField = getChildNamed(atm,"fclient");
		JLabel result = getChildNamed(atm, "lresult");
		JButton btnWithdraw= getChildNamed(atm, "jButton1");
		JButton btnTransfer= getChildNamed(atm, "jButton2");

		Component[] components = {amountField, clientField,result,btnTransfer, btnWithdraw};
		Arrays.stream(components).forEach(Assert::assertNotNull);

		amountField.setValue(200d);
		clientField.setValue(1);

		btnWithdraw.doClick();
		Assert.assertEquals("Withdraw successfully for : 200.0",result.getText());

		btnTransfer.doClick();
		Assert.assertEquals("Transfer successfully  for : 200.0", result.getText());

	}

	@After
	public void tearDown() {
		if(this.atm != null){
			this.atm.dispose();
			this. atm = null;
		}
	}
}