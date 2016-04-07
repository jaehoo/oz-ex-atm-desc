package com.oz.atm;

import com.oz.atm.gui.CajeroSwing;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    /**
     * Show main menu for ATP
     * @param args
     */
    public static void main(String[] args) {
        
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        final CajeroSwing cajero = (CajeroSwing) context.getBean("cajeroSwing");
        
        cajero.setVisible(true);
    }
    
}
