package com.oz.atm.service;

import com.oz.atm.util.AbstractTest;
import org.junit.Test;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

public class CajeroBancarioTest extends AbstractTest {

    @Resource(name="cajeroBancario")
    private Cajero cajero;


    @Test
    @Rollback(true)
    @Transactional
    public void testRetirar() throws Exception {
        cajero.retirar(1, 3000);
    }

    @Test
    @Rollback(true)
    @Transactional
    public void testTransferir() throws Exception {
        cajero.transferir(1, 400);
    }
}
