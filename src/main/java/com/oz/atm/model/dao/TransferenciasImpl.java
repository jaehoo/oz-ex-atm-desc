package com.oz.atm.model.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TransferenciasImpl extends AbstractDao implements Transferencias {

    public static final Logger LOG = LoggerFactory.getLogger(TransferenciasImpl.class);

    @Override
    public void transferir(Integer idCustomer, double amount) {

        LOG.info("No Cliente:{} , Transferir:{}",idCustomer,amount);

    }
}
