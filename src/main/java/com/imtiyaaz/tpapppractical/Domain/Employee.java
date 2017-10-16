package com.imtiyaaz.tpapppractical.Domain;

import javax.persistence.*;

/**
 * Created by Imtiyaaz on 2017/08/06.
 */
@Entity
public class Employee {

    @Id
    @Column(name = "employeeNumber", nullable = false)
    @GeneratedValue
    private int employeeNumber;

    @Column(name = "employeeCnp", nullable = false, unique = true)
    private String employeeCnp;

    @Column(name = "employeeName")
    private String employeeName;

    @Column(name = "employeeEmail", unique = true)
    private String employeeEmail;

    @Column(name = "employeePhone", unique = true)
    private String employeePhone;

    @Column(name = "employeeAddress")
    private String employeeAddress;

    @OneToOne
    @JoinColumn(name = "employeeNumber")
    private User user;

    public Employee(String employeeCnp, String employeeName, String employeeEmail, String employeePhone, String employeeAddress) {
    }

    public Employee(Builder builder)
    {
        this.employeeNumber = builder.employeeNumber;
        this.employeeCnp = builder.employeeCnp;
        this.employeeName = builder.employeeName;
        this.employeeEmail = builder.employeeEmail;
        this.employeePhone = builder.employeePhone;
        this.employeeAddress = builder.employeeAddress;

    }

    public static class Builder
    {
        private int employeeNumber;
        private String employeeCnp;
        private String employeeName;
        private String employeeEmail;
        private String employeePhone;
        private String employeeAddress;
        private User user;

        public Builder employeeNumber(int value)
        {
            this.employeeNumber = value;
            return this;
        }

        public Builder employeeCnp(String value)
        {
            this.employeeCnp = value;
            return this;
        }

        public Builder employeeName(String value)
        {
            this.employeeName = value;
            return this;
        }

        public Builder employeeEmail(String value)
        {
            this.employeeEmail = value;
            return this;
        }

        public Builder employeePhone(String value)
        {
            this.employeePhone = value;
            return this;
        }

        public Builder employeeAddress(String value)
        {
            this.employeeAddress = value;
            return this;
        }

        public Builder user(User value)
        {
            this.user = value;
            return this;
        }

        public Employee build()
        {
            return new Employee(this);
        }
    }

    public User getUser() { return user; }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getEmployeeCnp() {
        return employeeCnp;
    }

    public void setEmployeeCnp(String employeeCnp) {
        this.employeeCnp = employeeCnp;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public String getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(String employeePhone) {
        this.employeePhone = employeePhone;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }
}
