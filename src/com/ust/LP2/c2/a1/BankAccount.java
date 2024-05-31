package com.ust.LP2.c2.a1;

import java.io.Serializable;

public class BankAccount implements Serializable {
    private int accNo;
    private String name;
    private Double balance;
    private String password;

    public BankAccount(int accNo, String name, Double balance, String password) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
        this.password = password;
    }

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
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
