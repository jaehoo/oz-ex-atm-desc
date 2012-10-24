package com.oz.atm.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ACCOUNT")
@org.hibernate.annotations.Entity(dynamicInsert = true, dynamicUpdate = true)
public class Account implements Serializable{

    private Integer idAccount;
    private Double balance;

    @Id
    @Column(name = "id_account")
    public Integer getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(Integer idAccount) {
        this.idAccount = idAccount;
    }

    @Column(name = "balance")
    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    private Customer customer;

    @ManyToOne(fetch= FetchType.LAZY)
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
