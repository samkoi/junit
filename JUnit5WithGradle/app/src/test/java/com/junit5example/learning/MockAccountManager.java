package com.junit5example.learning;

import java.util.Map;
import java.util.HashMap;

public class MockAccountManager implements AccountManager {

    private Map<String, Account> accounts = new HashMap<String, Account>();

    public void addAccout(String id, Account account) {
        this.accounts.put(id, account);
    }

    @Override
    public Account findAccountForUser(String userId) {
        return this.accounts.get(userId);
    }

    @Override
    public void updateAccount(Account account) {
        // not required for testing

    }

}
