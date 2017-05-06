package com.example.emiliano.traskilada.connectors;

import com.example.emiliano.traskilada.models.Account;
import com.example.emiliano.traskilada.models.User;
import com.example.emiliano.traskilada.networking.services.AccountService;

import retrofit2.Callback;

/**
 * @author J. Pichardo
 */

public class AccountConnector {

    private final AccountService accountService;

    private Callback<User> loginCallback;


    public AccountConnector(AccountService accountService) {
        this.accountService = accountService;
    }

    public void login(Account account) {
        accountService.authenticate(account).enqueue(loginCallback);
    }

    public AccountConnector setLoginCallback(Callback<User> loginCallback) {
        this.loginCallback = loginCallback;
        return this;
    }
}
