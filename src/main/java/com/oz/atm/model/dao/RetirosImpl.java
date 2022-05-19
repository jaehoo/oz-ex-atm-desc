package com.oz.atm.model.dao;

import com.oz.atm.model.persistence.Account;
import com.oz.atm.model.persistence.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * <p>RetirosImpl class.</p>
 *
 * @author Jaehoo
 * @since 2.0.0
 */
public class RetirosImpl extends AbstractDao implements Retiros{

    /** Constant <code>log</code> */
    public static final Logger log = LoggerFactory.getLogger(RetirosImpl.class);

    /** {@inheritDoc} */
    @Override
    public void retirar(Integer idCustomer, double amount) {

        log.info("Cliente:{} ,Retirar:{}", idCustomer, amount);

        Customer c = sf.getCurrentSession().get(Customer.class, idCustomer);

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
