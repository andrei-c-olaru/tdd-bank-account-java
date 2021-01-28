package org.xpdojo.bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoneyTest {
    @Test
    public void createMoney(){
        Money money = new Money();
        assertEquals(money.getAmount(), 0);
    }

    @Test
    public void createMoneyNonZero(){
        Money money = new Money(100);
        assertEquals(money.getAmount(), 100);
    }




}