package com.imtiyaaz.tpapppractical.Domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Imtiyaaz on 2017/08/05.
 */
@Entity
public class Account implements Serializable{
   private static final float MAX_RES = 100000;
   private static final float MIN_RES = 0;

   @Id
   @Column(name = "accountNumber", nullable = false)
   @GeneratedValue
   private String accountNumber;

   @Column(name = "accountType")
   private String accountType;

   @Column(name = "accBalance")
   private double accBalance;

   @Column(name = "CreateAccount")
   private String CreateAccount;

   @ManyToOne
   @JoinColumn(name = "cId")
   private Client client;

   public Account(String accountType, float accBalance, Date date){

   }

   public Account(Builder builder){
       this.accountNumber = builder.accountNumber;
       this.accountType = builder.accountType;
       this.accBalance = builder.accBalance;
       this.CreateAccount = builder.CreateAccount;
       this.client = builder.client;
   }

   public static class Builder{
       private static final float MAX_RES = 100000;
       private static final float MIN_RES = 0;
       private String accountNumber;
       private String accountType;
       private double accBalance;
       private String CreateAccount;
       private Client client;

       public Builder accountNumber(String value)
       {
           this.accountNumber = value;
           return this;
       }

       public Builder accountType(String value)
       {
            this.accountType = value;
            return this;
       }


       public Builder accBalance(double value)
       {
           this.accBalance = value;
           return this;
       }

       public Builder CreateAccount(String value)
       {
           this.CreateAccount = value;
           return this;
       }

       public Builder client(Client value)
       {
           this.client = value;
           return this;
       }

       public Account build()
       {
           return new Account(this);
       }

   }

   public static float getMaxRes()
   {
       return MAX_RES;
   }

   public static float getMinRes()
   {
       return MIN_RES;
   }

   public void setAccountNumber(String accountNumber) {
      this.accountNumber = accountNumber;
   }

   public void setAccountType(String accountType) {
      this.accountType = accountType;
   }

   public void setAccBalance(double accBalance) {
      this.accBalance = accBalance;
   }

   public void setCreateAccount(String createAccount) {
      CreateAccount = createAccount;
   }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public double getAccBalance() {
        return accBalance;
    }

    public String getCreateAccount() {
        return CreateAccount;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String toString()
    {
        return("Account Number: "+accountNumber+"\nHolder: "+client.toString());
    }
}
