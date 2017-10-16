package com.imtiyaaz.tpapppractical.Domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Imtiyaaz on 2017/08/06.
 */
@Entity
public class Deposit {

    @Id
    @Column(name = "Amount")
    @GeneratedValue
    private float Amount;

    @Column(name = "date")
    private Date date;

    @ManyToOne
    @JoinColumn(name = "accountNumber")
    private Account account;

    //Still to be Defined.
    private float deposit;
    private float Calculate;

    public Deposit() {
    }

    public float getAmount() {
        return Amount;
    }

    public void setAmount(float amount) {
        Amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public float getDeposit() {
        return deposit;
    }

    public Deposit(Builder builder)
    {

    }

    public static class Builder
    {

    }
}
