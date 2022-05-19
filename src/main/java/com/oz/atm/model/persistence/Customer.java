package com.oz.atm.model.persistence;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

/**
 * <p>Customer class.</p>
 *
 * @author Jaehoo
 * @since 2.0.0
 */
@Entity
@Table(name = "CUSTOMER")
@DynamicUpdate
@DynamicInsert
@SequenceGenerator(name = "SQ_CUSTOMER", sequenceName = "SQ_CUSTOMER", allocationSize = 1) // for Oracle
public class Customer implements Serializable{

    private Integer idCustomer;
    private String name;

    /**
     * <p>Constructor for Customer.</p>
     */
    public Customer() {
    }

    /**
     * <p>Constructor for Customer.</p>
     *
     * @param idCustomer a {@link java.lang.Integer} object.
     * @param name a {@link java.lang.String} object.
     */
    public Customer(Integer idCustomer, String name) {
        this.idCustomer = idCustomer;
        this.name = name;
    }

    /**
     * <p>Getter for the field <code>idCustomer</code>.</p>
     *
     * @return a {@link java.lang.Integer} object.
     */
    @Id
    @Column(name = "id_customer")
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "SQ_CUSTOMER")
    public Integer getIdCustomer() {
        return idCustomer;
    }

    /**
     * <p>Setter for the field <code>idCustomer</code>.</p>
     *
     * @param idCustomer a {@link java.lang.Integer} object.
     */
    public void setIdCustomer(Integer idCustomer) {
        this.idCustomer = idCustomer;
    }

    /**
     * <p>Getter for the field <code>name</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    @Column(name = "name")
    public String getName() {
        return name;
    }

    /**
     * <p>Setter for the field <code>name</code>.</p>
     *
     * @param name a {@link java.lang.String} object.
     */
    public void setName(String name) {
        this.name = name;
    }

    private Collection<Account> accounts;

    /**
     * <p>Getter for the field <code>accounts</code>.</p>
     *
     * @return a {@link java.util.Collection} object.
     */
    @OneToMany(mappedBy = "customer", fetch= FetchType.LAZY)
    public Collection<Account> getAccounts() {
        return accounts;
    }

    /**
     * <p>Setter for the field <code>accounts</code>.</p>
     *
     * @param accounts a {@link java.util.Collection} object.
     */
    public void setAccounts(Collection<Account> accounts) {
        this.accounts = accounts;
    }
}
