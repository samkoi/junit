package com.junit5example.learning;

public class AccountServices {
    private AccountManager accountManager;

    public void setAccountManager(AccountManager accountManager) {
        this.accountManager = accountManager;
    }

    public void transfer(String receiverId, String senderId, long amount) {
        Account sender = accountManager.findAccountForUser(senderId);
        Account receiver = accountManager.findAccountForUser(receiverId);
        sender.debit(amount);
        receiver.credit(amount);
        this.accountManager.updateAccount(sender);
        this.accountManager.updateAccount(receiver);
    }

}
