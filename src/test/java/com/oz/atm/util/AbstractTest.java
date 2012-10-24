package com.oz.atm.util;

import junit.framework.TestCase;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

/**
 * Created by Orbital Zero.
 * Date: 23/10/12
 * Time: 12:31 PM
 * Author: Lic. José Alberto Sánchez González
 * Twitter: @jaehoox
 * mail: <a href="mailto:jaehoo@gmail.com">jaehoo@gmail.com</a>
 */
@ContextConfiguration(locations = { "classpath:applicationContext.xml"})
@TestExecutionListeners({TransactionalTestExecutionListener.class})
@RunWith(SpringJUnit4ClassRunner.class)
public abstract class AbstractTest extends AbstractJUnit4SpringContextTests{


}
