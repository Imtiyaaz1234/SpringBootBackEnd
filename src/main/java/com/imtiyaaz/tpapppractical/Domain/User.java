package com.imtiyaaz.tpapppractical.Domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Imtiyaaz on 2017/08/05.
 */
@Entity
public class User {

    @Id
    @Column(name = "employeeId")
    @GeneratedValue
    private int employeeId;

    @Column(name = "employeeUsername", unique = true)
    private String employeeUsername;

    @Column(name = "employeePassword")
    private String employeePassword;


    private String role;

    public User(String employeeUsername, String employeePassword, String role_user) {
    }

    public User(Builder builder)
    {
        this.employeeId = builder.employeeId;
        this.employeeUsername = builder.employeeUsername;
        this.employeePassword = builder.employeePassword;
        this.role = builder.role;
    }

    public boolean isEnabled() {
        return true;
    }

    public static class Builder
    {
        private int employeeId;
        private String employeeUsername;
        private String employeePassword;
        private String role;

        public Builder employeeId(int value)
        {
            this.employeeId = value;
            return this;
        }

        public Builder employeeUsername(String value)
        {
            this.employeeUsername = value;
            return this;
        }

        public Builder employeePassword(String value)
        {
            this.employeePassword = value;
            return this;
        }

        public Builder role(String value)
        {
            this.role = value;
            return this;
        }

        public User Build()
        {
            return new User(this);
        }


    }


    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeUsername() {
        return employeeUsername;
    }

    public void setEmployeeUsername(String employeeUsername) {
        this.employeeUsername = employeeUsername;
    }

    public String getEmployeePassword() {
        return employeePassword;
    }

    public void setEmployeePassword(String employeePassword) {
        this.employeePassword = employeePassword;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString()
    {
        return("ID: " + this.employeeId + "UserName: " + this.employeeUsername);
    }
}
