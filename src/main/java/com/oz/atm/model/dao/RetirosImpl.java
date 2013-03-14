package com.oz.atm.model.dao;

import com.oz.atm.model.persistence.Account;
import com.oz.atm.model.persistence.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class RetirosImpl extends AbstractDao implements Retiros{

    public static final Logger LOG = LoggerFactory.getLogger(RetirosImpl.class);

    @Override
    public void retirar(Integer idCustomer, double amount) {

        LOG.info("Cliente:{} ,Retirar:{}", idCustomer,amount);

        Customer c = new Customer();
        c.setIdCustomer(idCustomer);
        
        Account a = new Account();
        a.setCustomer(c);
        a.setBalance(amount);

        sf.getCurrentSession().save(a);

    }
}
