package org.xpdojo.bank;

/**
 * Immutable class to represent Money as a concept.
 * This class should have no accessor methods.
 */
public final class Money {

    private int amount = 0;

    public Money(){

    }

    public Money(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void add(Money money) {
        this.amount += money.getAmount();
    }

    public void subtract(Money money){
        this.amount -= money.getAmount();
    }
}
