package com.oz.atm.model.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>TransferenciasImpl class.</p>
 *
 * @author Jaehoo
 * @since 2.0.0
 */
public class TransferenciasImpl extends AbstractDao implements Transferencias {

    /** Constant <code>LOG</code> */
    public static final Logger LOG = LoggerFactory.getLogger(TransferenciasImpl.class);

    /** {@inheritDoc} */
    @Override
    public void transferir(Integer idCustomer, double amount) {

        LOG.info("No Cliente:{} , Transferir:{}",idCustomer,amount);

    }
}
