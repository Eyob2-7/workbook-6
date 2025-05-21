package com.pluralsight.finance;

public class BankAccount implements Valuable {
    private String name;
    private String accountNumber;
    private double balance;

    public BankAccount(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

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

    @Override
    public String toString() {
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }

    // Deposits a positive amount into the account.
    public void deposit(double amount){
       if (amount > 0){
           balance += amount;
       };
    }

    // Withdraws a valid amount from the account if sufficient balance is available.
    public void withdraw(double amount){
        if (amount > 0 && amount <= balance){
            balance += amount;
        }
    }

    @Override
    public double getValue() {
        return balance;
    }
}
