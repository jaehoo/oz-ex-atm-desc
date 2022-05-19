package com.oz.atm.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created with IntelliJ IDEA.
 * User: asanchez
 * Date: 20/02/13
 * Time: 10:39
 *
 * @author Jaehoo
 * @since 2.0.0
 */
public class CajeroOtzo implements Cajero {

    private static final Logger log = LoggerFactory.getLogger(CajeroOtzo.class);

    /** {@inheritDoc} */
    public void retirar(Integer idCustomer, double amount){
        log.info("Withdraw fail =( ");
    }

    /** {@inheritDoc} */
    @Override
    public void transferir(Integer idCustomer, double amount) {
        log.info("Transfer fail =( ");
    }
}
