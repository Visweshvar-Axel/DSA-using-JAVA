package com.ust.LP2.c2.a1;

import java.io.Serializable;

public class BankAccount implements Serializable {
    private String accNo;
    private String name;
    private Double balance;
    private String password;

    public BankAccount() {}

    public BankAccount(String accNo, String name, Double balance, String password) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
        this.password = password;
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
