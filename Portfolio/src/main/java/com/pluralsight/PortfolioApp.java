package com.pluralsight;

import com.pluralsight.finance.*;

public class PortfolioApp {
    public static void main(String[] args) {

        // Test Bank account class
        BankAccount account1 = new BankAccount("Pam", "123", 12500);
        BankAccount account2 = new BankAccount("Gary", "456", 1500);

        // try to deposit money into both accounts
        account1.deposit(100);
        account2.deposit(100);

        // Print the updated account numbers and balances
        System.out.println("Account 1: " + account1.getAccountNumber() + ", Balance: $" + account1.getBalance());
        System.out.println("Account 2: " + account2.getAccountNumber() + ", Balance: $" + account2.getBalance());

        // Create a portfolio
        Portfolio johnPortfolio = new Portfolio("John", "John");

        // Create valuables (fixed asset and liquidity)
        Valuable gold = new Gold("21 karat", 100, 10);
        Valuable house = new House("Primary residence", 10000, 2000, 1000, 3);
        Valuable jewelry = new Jewelry("Diamond", 10000, 21);
        Valuable account = new BankAccount("John", "123", 12500);
        Valuable creditCard = new CreditCard("John", "174658", 5000);

        // Add asset to portfolio
        johnPortfolio.add(gold);
        johnPortfolio.add(house);
        johnPortfolio.add(jewelry);
        johnPortfolio.add(account);
        johnPortfolio.add(creditCard);
        System.out.println("Total Asset Value is $" + johnPortfolio.getValue());
        System.out.println("Least Valuable Asset is " + johnPortfolio.getLeastValuable());
        System.out.println("Most Valuable Asset is " + johnPortfolio.getMostValuable());

    }

}
