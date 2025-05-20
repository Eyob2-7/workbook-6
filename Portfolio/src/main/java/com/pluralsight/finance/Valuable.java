package com.pluralsight.finance;

/**
 * An interface for anything that has a financial value.
 * Implemented by assets like BankAccount, CreditCard, House, Jewelry.
 * */
public interface Valuable {
    double getValue();
}
