package com.junit5example.learning;

public interface AccountManager {
    Account findAccountForUser(String userId);

    void updateAccount(Account account);

}
