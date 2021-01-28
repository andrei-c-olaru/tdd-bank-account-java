package org.xpdojo.bank;

public class Account {

    private Money balance = new Money();

    public Money getBalance() {
        return balance;
    }

    public void deposit(Money money) {
        this.balance.add(money);
    }
}
