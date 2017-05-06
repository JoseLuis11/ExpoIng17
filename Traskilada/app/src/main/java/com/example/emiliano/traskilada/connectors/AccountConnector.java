package com.example.emiliano.traskilada.connectors;

import com.example.emiliano.traskilada.models.Account;
import com.example.emiliano.traskilada.models.User;
import com.example.emiliano.traskilada.networking.services.AccountService;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * @author J. Pichardo
 */

public class AccountConnector {

    private final AccountService accountService;

    private Callback<User> loginCallback;


    public AccountConnector(AccountService accountService) {
        this.accountService = accountService;
    }

    public User login(Account account) {
        return execute(accountService.authenticate(account));
    }

    protected static <R> R execute(Call<R> call) {
        try {
            Response<R> execute = call.execute();
            if (execute.isSuccessful())
                return execute.body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
