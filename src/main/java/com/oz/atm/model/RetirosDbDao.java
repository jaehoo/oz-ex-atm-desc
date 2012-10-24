package com.oz.atm.model;

import org.hibernate.SessionFactory;

/**
 * Created by Orbital Zero.
 * Date: 22/10/12
 * Time: 11:28 AM
 * Author: Lic. José Alberto Sánchez González
 * Twitter: @jaehoox
 * mail: <a href="mailto:jaehoo@gmail.com">jaehoo@gmail.com</a>
 */
public class RetirosDbDao implements Retiros{

    private SessionFactory sf;

    public void setSf(SessionFactory sf) {
        this.sf = sf;
    }

    @Override
    public void retiro(Double importe) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
