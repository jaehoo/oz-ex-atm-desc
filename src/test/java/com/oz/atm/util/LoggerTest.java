package com.oz.atm.util;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Orbital Zero.
 * Date: 23/10/12
 * Time: 12:34 PM
 * Author: Lic. José Alberto Sánchez González
 * Twitter: @jaehoox
 * mail: <a href="mailto:jaehoo@gmail.com">jaehoo@gmail.com</a>
 */
public class LoggerTest extends AbstractTest {

    private static final Logger logger= LoggerFactory.getLogger(LoggerTest.class);

    @Test
    public void testLogger(){

        logger.info("----------- INFO");
        logger.debug("----------- DEBUG");
        logger.error("----------- ERROR");
        
        // Test Spring and Hibernate Config
        //ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");

    }

    @Test
    @Transactional
    public void testConfig(){

        SessionFactory sf= (SessionFactory) applicationContext.getBean("sessionFactory");

        List result = sf.getCurrentSession().createSQLQuery("show tables").list();
        
        logger.info("Resultado:{}", result);
        
        
    }


}
