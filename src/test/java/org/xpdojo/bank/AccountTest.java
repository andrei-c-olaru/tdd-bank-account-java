package org.xpdojo.bank;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class AccountTest {

    @Test
    public void createAccountWithAppropriateBalance(){
        Account account = new Account();
        assertEquals(account.getBalance(), 0);
    }

    @Test
    public void depositAnAmount(){
        Account account = new Account();
        account.deposit(100);
        assertThat(account.getBalance()).isEqualTo(100);
    }

    @Test
    public void depositMultipleAmount(){
        Account account = new Account();
        account.deposit(100);
        account.deposit(100);
        assertThat(account.getBalance()).isEqualTo(200);
    }


}
