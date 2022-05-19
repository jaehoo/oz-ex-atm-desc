package com.oz.atm.service;

import com.oz.atm.model.dao.Retiros;
import com.oz.atm.model.dao.Transferencias;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>CajeroBancario class.</p>
 *
 * @author Jaehoo
 * @since 2.0.0
 */
public class CajeroBancario implements Cajero {

    /** Constant <code>LOG</code> */
    public static final Logger LOG = LoggerFactory.getLogger(CajeroBancario.class);

    private Retiros retiros;
    private Transferencias transferencias;

    /**
     * <p>Setter for the field <code>retiros</code>.</p>
     *
     * @param retiros a {@link com.oz.atm.model.dao.Retiros} object.
     */
    public void setRetiros(Retiros retiros) {
        this.retiros = retiros;
    }

    /**
     * <p>Setter for the field <code>transferencias</code>.</p>
     *
     * @param transferencias a {@link com.oz.atm.model.dao.Transferencias} object.
     */
    public void setTransferencias(Transferencias transferencias) {
        this.transferencias = transferencias;
    }

    /** {@inheritDoc} */
    @Override
    @Transactional
    public void retirar(Integer idCustomer, double amount) {
        retiros.retirar(idCustomer,amount);
    }

    /** {@inheritDoc} */
    @Override
    @Transactional
    public void transferir(Integer idCustomer, double amount) {

        retiros.retirar(idCustomer,amount);
        transferencias.transferir(idCustomer,amount);
    }
}
