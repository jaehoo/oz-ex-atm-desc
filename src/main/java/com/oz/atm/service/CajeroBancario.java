package com.oz.atm.service;

import com.oz.atm.model.dao.Retiros;
import com.oz.atm.model.dao.Transferencias;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

public class CajeroBancario implements Cajero {

    public static final Logger LOG = LoggerFactory.getLogger(CajeroBancario.class);

    private Retiros retiros;
    private Transferencias transferencias;

    public void setRetiros(Retiros retiros) {
        this.retiros = retiros;
    }

    public void setTransferencias(Transferencias transferencias) {
        this.transferencias = transferencias;
    }

    @Override
    @Transactional
    public void retirar(Integer idCustomer, double amount) {
        retiros.retirar(idCustomer,amount);
    }

    @Override
    @Transactional
    public void transferir(Integer idCustomer, double amount) {

        retiros.retirar(idCustomer,amount);
        transferencias.transferir(idCustomer,amount);
    }
}
