package com.oz.atm.model.dao;

import com.oz.atm.util.AbstractTest;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;

public class TransferenciasImplTest extends AbstractTest {

    public static final Logger LOG = LoggerFactory.getLogger(TransferenciasImplTest.class);

    @Resource(name="trasferenciasDao")
    private Transferencias transferencias;

    @Test
    public void testTransferir() throws Exception {

        LOG.info("Prueba de Transferencia...");

        transferencias.transferir(1,2000);

    }
}
