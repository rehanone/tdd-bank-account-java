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
        currentBalance -= amount;
        return amount;
    }

    public void transferOut(int amount, Account otherAccount) {
        int otherAmount = this.withdraw(amount);
        otherAccount.deposit(otherAmount);
    }
}
