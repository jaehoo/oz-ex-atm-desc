package com.oz.atm.util;

import java.util.List;

import com.oz.atm.model.persistence.Customer;
import org.hibernate.SessionFactory;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;
import static org.junit.Assert.*;
import javax.annotation.Resource;

/**
 * Created by Orbital Zero.
 * Date: 23/10/12
 * Time: 12:34 PM
 */
public class LoggerTest extends AbstractTest {

    private static final Logger logger= LoggerFactory.getLogger(LoggerTest.class);

    @Resource(name = "sessionFactory")
    private SessionFactory sf;

    @Test
    @Ignore("for dummy test logger")
    public void testLogger(){

        logger.info("----------- INFO");
        logger.debug("----------- DEBUG");
        logger.error("----------- ERROR");

    }

    @Test
    @Transactional(readOnly = true)
    public void testConfig(){

        List<Customer> result = sf.getCurrentSession()
                .createNativeQuery("SELECT * FROM CUSTOMER",Customer.class).list();
        assertEquals(2,  result.size());

    }


}
