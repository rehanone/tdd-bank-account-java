package org.xpdojo.bank;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
    public void depositAnAmountToIncreaseTheBalance() {
        Account account = new Account();
        assertThat(account.balance()).isEqualTo(0);
    }

    @Test
    public void canDepositAnAmount() {
        Account account = new Account();
        account.deposit(100);
        assertThat(account.balance()).isEqualTo(100);
    }

    @Test
    public void canDepositMultipleAmounts() {
        Account account = new Account();
        account.deposit(100);
        account.deposit(200);
        assertThat(account.balance()).isEqualTo(300);
    }

    @Test
    public void canWithdrawAnAmount() {
        Account account = new Account();
        account.deposit(100);
        account.withdraw(50);
        assertThat(account.balance()).isEqualTo(50);
    }

    @Test
    public void canWithdrawMultipleAmounts() {
        Account account = new Account();
        account.deposit(100);
        account.withdraw(20);
        account.withdraw(55);
        assertThat(account.balance()).isEqualTo(25);
    }

    @Test
    public void canTransferMoneyOutToAnotherAccount() {
        Account accountA = new Account();
        Account accountB = new Account();
        accountA.deposit(100);
        accountA.transferOut(20, accountB);
        assertThat(accountA.balance()).isEqualTo(80);
        assertThat(accountB.balance()).isEqualTo(20);
    }

}
