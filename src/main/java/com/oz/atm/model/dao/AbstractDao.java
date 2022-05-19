package com.oz.atm.model.dao;

import org.hibernate.SessionFactory;

/**
 * <p>AbstractDao class.</p>
 *
 * @author Jaehoo
 * @since 2.0.0
 */
public class AbstractDao {

    protected SessionFactory sf;

    /**
     * <p>Setter for the field <code>sf</code>.</p>
     *
     * @param sf a {@link org.hibernate.SessionFactory} object.
     */
    public void setSf(SessionFactory sf) {
        this.sf = sf;
    }
}
