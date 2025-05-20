package com.pluralsight;

import com.pluralsight.finance.BankAccount;

public class PortfolioApp {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Pam", "123", 12500);
        BankAccount account2 = new BankAccount("Gary", "456", 1500);

   // try to deposit money into both accounts
        account1.deposit(100);
        account2.deposit(100);

        // Print the updated account numbers and balances
        System.out.println("Account 1: " + account1.getAccountNumber() + ", Balance: $" + account1.getBalance());
        System.out.println("Account 2: " + account2.getAccountNumber() + ", Balance: $" + account2.getBalance());
    }

}
