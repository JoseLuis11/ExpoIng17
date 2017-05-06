package com.example.emiliano.traskilada.networking.services;

import com.example.emiliano.traskilada.models.Account;
import com.example.emiliano.traskilada.models.User;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * @author J. Pichardo
 */

public interface AccountService {

    String BASE_URL = "account/";

    @POST(BASE_URL)
    Call<User> authenticate(@Body Account account); //TODO: LoginDTO

}
