package com.oz.atm;

import com.oz.atm.gui.CajeroSwing;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <p>Main class.</p>
 *
 * @author Jaehoo
 * @since 2.0.0
 */
public class Main {

    /**
     * Show main menu for ATP
     *
     * @param args an array of {@link java.lang.String} objects.
     */
    public static void main(String[] args) {
        
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        final CajeroSwing cajero = (CajeroSwing) context.getBean("cajeroSwing");
        
        cajero.setVisible(true);
    }
    
}
