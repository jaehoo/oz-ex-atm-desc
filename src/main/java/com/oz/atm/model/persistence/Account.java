package com.oz.atm.model.persistence;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.io.Serializable;

/**
 * <p>Account class.</p>
 *
 * @author Jaehoo
 * @since 2.0.0
 */
@Entity
@Table(name = "ACCOUNT")
@DynamicUpdate
@DynamicInsert
@SequenceGenerator(name = "SQ_ACCOUNT", sequenceName = "SQ_ACCOUNT",allocationSize = 1) // for Oracle
public class Account implements Serializable{

    private Integer idAccount;
    private Double balance;

    /**
     * <p>Getter for the field <code>idAccount</code>.</p>
     *
     * @return a {@link java.lang.Integer} object.
     */
    @Id
    @Column(name = "id_account")
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "SQ_ACCOUNT")
    public Integer getIdAccount() {
        return idAccount;
    }

    /**
     * <p>Setter for the field <code>idAccount</code>.</p>
     *
     * @param idAccount a {@link java.lang.Integer} object.
     */
    public void setIdAccount(Integer idAccount) {
        this.idAccount = idAccount;
    }

    /**
     * <p>Getter for the field <code>balance</code>.</p>
     *
     * @return a {@link java.lang.Double} object.
     */
    @Column(name = "balance")
    public Double getBalance() {
        return balance;
    }

    /**
     * <p>Setter for the field <code>balance</code>.</p>
     *
     * @param balance a {@link java.lang.Double} object.
     */
    public void setBalance(Double balance) {
        this.balance = balance;
    }

    private Customer customer;

    /**
     * <p>Getter for the field <code>customer</code>.</p>
     *
     * @return a {@link com.oz.atm.model.persistence.Customer} object.
     */
    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name = "id_customer", nullable = false)
    public Customer getCustomer() {
        return customer;
    }

    /**
     * <p>Setter for the field <code>customer</code>.</p>
     *
     * @param customer a {@link com.oz.atm.model.persistence.Customer} object.
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
