package com.oz.atm.model.dao;

import com.oz.atm.model.persistence.Account;
import com.oz.atm.model.persistence.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class RetirosImpl extends AbstractDao implements Retiros{

    public static final Logger log = LoggerFactory.getLogger(RetirosImpl.class);

    @Override
    public void retirar(Integer idCustomer, double amount) {

        log.info("Cliente:{} ,Retirar:{}", idCustomer, amount);

        Customer c =(Customer) sf.getCurrentSession().get(Customer.class, idCustomer);

        if(c== null){

            log.info("New Customer...");
            c =  new Customer(idCustomer,"CUSTOMER "+idCustomer);
            sf.getCurrentSession().save(c);
        }

        Account a = new Account();
        a.setCustomer(c);
        a.setBalance(amount);

        sf.getCurrentSession().save(a);

    }
}
