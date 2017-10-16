package com.imtiyaaz.tpapppractical.Domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Imtiyaaz on 2017/08/06.
 */
@Entity
public class Withdrawal {

    @Id
    @Column(name = "Amount")
    private float Amount;

    @Column(name = "date")
    private Date date;

    @ManyToOne
    @JoinColumn(name = "accountNumber")
    private Account account;

    //Still Finish the Calculations bit Where you have to minus current value with value that user wants to withdraw
    private float Calculate;
    private float withDrawal = 0;

    public Withdrawal() {
    }

    public Withdrawal(Builder builder)
    {

    }

    public static class Builder
    {
        private float Amount;
        private Date date;
        private Account account;

        public Builder Amount(float value)
        {
            this.Amount = value;
            return this;
        }

        public Builder date(Date value)
        {
            this.date = value;
            return this;
        }

        public Builder account(Account value)
        {
            this.account = value;
            return this;
        }

        public Withdrawal build()
        {
            return new Withdrawal(this);
        }
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

    public String toString()
    {
        return("Account" + account);
    }


}
