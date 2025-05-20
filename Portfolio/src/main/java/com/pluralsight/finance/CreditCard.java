package com.pluralsight.finance;

public class CreditCard implements Valuable{
    private String name;
    private String accountNumber;
    private double balance;

    // Constructor
    public CreditCard(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Adds a charge to the credit card.
    public void charge(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Pays down the credit card balance.
    public void pay(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    // returns a negative balance since it's a liability
    @Override
    public double getValue() {
        return -balance;
    }
}
