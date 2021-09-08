package com.junit5example.learning;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.checkerframework.checker.lock.qual.MayReleaseLocks;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class MockitoTestAccountService {

    // This tells Mockito to create a mock object of type AccountManager.
    @Mock
    private AccountManager mockAccountManager;

    @Test
    public void testTranster() {
        Account account1 = new Account("001", 5000);
        Account account2 = new Account("002", 2000);

        Mockito.lenient().when(mockAccountManager.findAccountForUser("001")).thenReturn(account1);
        Mockito.lenient().when(mockAccountManager.findAccountForUser("002")).thenReturn(account2);

        AccountServices accountServices = new AccountServices();
        accountServices.setAccountManager(mockAccountManager);
        accountServices.transfer("002", "001", 2000);

        assertEquals(3000, account1.getBalance());
        assertEquals(4000, account2.getBalance());
    }

}