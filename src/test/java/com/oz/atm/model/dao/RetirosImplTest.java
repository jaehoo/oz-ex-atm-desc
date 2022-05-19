package com.oz.atm.model.dao;

import com.oz.atm.model.persistence.Customer;
import com.oz.atm.util.AbstractTest;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class RetirosImplTest extends AbstractTest {

    private static final Logger log = LoggerFactory.getLogger(RetirosImplTest.class);

    @Resource(name="retirosDao")
    private Retiros retiros;

    @Resource(name = "sessionFactory")
    private SessionFactory sessionFactory;

    @Test
    @Transactional
    @Rollback(false)
    public void testRetirar() {
        retiros.retirar(1, 100);
    }

    @Test(expected = Test.None.class)
    @Transactional
    public void testWidthdrawNewClient() {
        retiros.retirar(3, 100);

    }
}