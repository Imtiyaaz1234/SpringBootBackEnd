package com.imtiyaaz.tpapppractical.Domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Imtiyaaz on 2017/08/05.
 */
@Entity
public class Client {

    @Id
    @Column(name = "cId", nullable = false)
    @GeneratedValue
    private int cId;

    @Column(name = "cCnp", nullable = false, unique = true)
    private String cCnp;

    @Column(name = "CIdNumber", unique = true)
    private String cIdNumber;

    @Column(name = "cName")
    private String cName;

    @Column(name = "cEmail", unique = true)
    private String cEmail;

    @Column(name = "cPhone", unique = true)
    private String cPhone;

    @Column(name = "cAddress")
    private String cAddress;

    public Client(String cIdNumber, String clientIdNumber, String clientName, String clientEmail, String clientPhone, String clientAddress){
        this.cId = cId;
    }

    public Client(Builder builder)
    {
        this.cId = builder.cId;
        this.cCnp = builder.cCnp;
        this.cIdNumber = builder.cIdNumber;
        this.cName = builder.cName;
        this.cEmail = builder.cEmail;
        this.cPhone = builder.cPhone;
        this.cAddress = builder.cAddress;

    }

    public static class Builder{
        private int cId;
        private String cCnp;
        private String cIdNumber;
        private String cName;
        private String cEmail;
        private String cPhone;
        private String cAddress;

        public Builder cId(int value)
        {
            this.cId = value;
            return this;
        }

        public Builder cCnp(String value)
        {
            this.cCnp = value;
            return this;
        }

        public Builder cIdNumber(String value)
        {
            this.cIdNumber = value;
            return this;
        }

        public Builder cName(String value)
        {
            this.cName = value;
            return this;
        }

        public Builder cEmail(String value)
        {
            this.cEmail = value;
            return this;
        }

        public Builder cPhone(String value)
        {
            this.cPhone = value;
            return this;
        }

        public Builder cAddress(String value)
        {
            this.cAddress = value;
            return this;
        }

        public Client build()
        {
            return new Client(this);
        }
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public void setcCnp(String cCnp) {
        this.cCnp = cCnp;
    }

    public void setcIdNumber(String cIdNumber) {
        this.cIdNumber = cIdNumber;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public void setcEmail(String cEmail) {
        this.cEmail = cEmail;
    }

    public void setcPhone(String cPhone) {
        this.cPhone = cPhone;
    }

    public void setcAddress(String cAddress) {
        this.cAddress = cAddress;
    }

    public int getcId() {
        return cId;
    }

    public String getcCnp() {
        return cCnp;
    }

    public String getcIdNumber() {
        return cIdNumber;
    }

    public String getcName() {
        return cName;
    }

    public String getcEmail() {
        return cEmail;
    }

    public String getcPhone() {
        return cPhone;
    }

    public String getcAddress() {
        return cAddress;
    }

    @Override
    public String toString()
    {
        return ("Client ID: "+this.cId+"\nClient name: "+this.cName+"\n CNP: "+this.cCnp+"\t CI: "
                +this.cIdNumber+"\nEmail: "+this.cEmail+"\tPhone: "
                +this.cPhone+"\nAddress: "+this.cAddress+"\n");
    }
}
