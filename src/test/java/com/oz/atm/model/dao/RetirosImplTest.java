package com.oz.atm.model.dao;

import com.oz.atm.util.AbstractTest;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

public class RetirosImplTest extends AbstractTest {

    private static final Logger LOG = LoggerFactory.getLogger(RetirosImplTest.class);

    @Resource(name="retirosDao")
    private Retiros retiros;
    
    @Test
    @Transactional
    @Rollback(false)
    public void testRetirar() {

        LOG.info("Prueba de Retiro... ");

        retiros.retirar(1, 100);

    }

}