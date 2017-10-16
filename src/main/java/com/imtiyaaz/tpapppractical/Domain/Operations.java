package com.imtiyaaz.tpapppractical.Domain;

import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;

/**
 * Created by Imtiyaaz on 2017/08/06.
 */
@Entity
public class Operations {

    @Id
    @Column(name = "operationTime")
    @GeneratedValue
    private Date operationTime;

    @Column(name = "operationName")
    private String operationName;

    @ManyToOne
    @JoinColumn(name = "employeeNumber")
    private User user;

    @ManyToOne
    @JoinColumn(name = "cId")
    private Client client;

    public Operations(Date date, String s, Client client, User user) {
    }

    public Operations(Builder builder)
    {
        this.operationTime = builder.operationTime;
        this.operationName = builder.operationName;
        this.client = builder.client;
        this.user = builder.user;
    }

    public static class Builder
    {
        private Date operationTime;
        private String operationName;
        private User user;
        private Client client;

        public Builder operationTime(Date value)
        {
            this.operationTime = value;
            return this;
        }

        public Builder operationName(String value)
        {
            this.operationName = value;
            return this;
        }

        public Builder user(User value)
        {
            this.user = value;
            return this;
        }

        public Builder client(Client value)
        {
            this.client = value;
            return this;
        }

        public Operations build()
        {
            return new Operations(this);
        }
    }

    public Date getOperationTime() {
        return operationTime;
    }

    public void setOperationTime(Date operationTime) {
        this.operationTime = operationTime;
    }

    public String getOperationName() {
        return operationName;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
