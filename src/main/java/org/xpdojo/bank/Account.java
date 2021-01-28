package org.xpdojo.bank;

public class Account {
    private int currentBalance = 0;

    public int balance() {
        return currentBalance;
    }

    public void deposit(int amount) {
        currentBalance += amount;
    }

    public int withdraw(int amount) {
        return currentBalance -= amount;
    }
}
