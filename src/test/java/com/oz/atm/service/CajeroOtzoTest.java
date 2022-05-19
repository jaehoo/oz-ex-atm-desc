package com.oz.atm.service;

import junit.framework.TestCase;
import org.junit.Assert;

/**
 * @author José Alberto Sánchez González
 * Twitter: <a href="https://twitter.com/jaehoox">@jaehoox</a>
 * <p>
 * Created on 18/5/2022 20:38
 **/
public class CajeroOtzoTest extends TestCase {

	private Cajero  atm;

	@Override
	public void setUp(){
		atm= new CajeroOtzo();
	}

	public void testMethods() {
		atm.retirar(1, 200d);
		atm.transferir(1, 100d);
		Assert.assertNotNull(atm);
	}

}