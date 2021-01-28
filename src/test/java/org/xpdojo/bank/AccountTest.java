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



}
