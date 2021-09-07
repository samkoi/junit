package com.junit5example.learning;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestAccountService {

    @Test
    public void TestAccountServices() {
        MockAccountManager mockAccountManager = new MockAccountManager();
        AccountServices accountServices = new AccountServices();
        accountServices.setAccountManager(mockAccountManager);

        Account account1 = new Account("001", 5000);
        Account account2 = new Account("002", 2000);

        mockAccountManager.addAccout("001", account1);
        mockAccountManager.addAccout("002", account2);

        accountServices.transfer("002", "001", 1000);

        assertEquals(account1.getBalance(), 4000);
        assertEquals(account2.getBalance(), 3000);

    }
}
