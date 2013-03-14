package com.oz.atm.model.dao;

import org.hibernate.SessionFactory;

public class AbstractDao {

    protected SessionFactory sf;

    public void setSf(SessionFactory sf) {
        this.sf = sf;
    }
}
