package com.example.emiliano.traskilada.networking.services;

import com.example.emiliano.traskilada.models.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/**
 * @author J. Pichardo
 */

public interface UserService extends BaseService<User> {

    String BASE_URL = "user/";

    @Override
    @GET(BASE_URL)
    Call<List<User>> getAll();

    @Override
    @GET(BASE_URL + "{id}")
    Call<User> getById(@Path("id") int id);

    @Override
    @POST(BASE_URL)
    Call<Void> create(@Body User user);

    @Override
    @PUT(BASE_URL + "{id}")
    Call<Void> update(@Path("id") int id, @Body User user);

    @Override
    @DELETE(BASE_URL + "{id}")
    Call<Void> delete(@Path("id") int id);

}
