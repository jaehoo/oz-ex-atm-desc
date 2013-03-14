package com.oz.atm.model.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Table(name = "CUSTOMER")
@org.hibernate.annotations.Entity(dynamicInsert = true, dynamicUpdate = true)
public class Customer implements Serializable{

    private Integer idCustomer;
    private String name;

    @Id
    @Column(name = "id_customer")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Integer idCustomer) {
        this.idCustomer = idCustomer;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    private Collection<Account> accounts;

    @OneToMany(mappedBy = "customer", fetch= FetchType.LAZY)
    public Collection<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(Collection<Account> accounts) {
        this.accounts = accounts;
    }
}
