package com.example.emiliano.traskilada.networking.services;

import com.example.emiliano.traskilada.models.Review;

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

public interface ReviewService {

    String BASE_URL = "review/";

    @GET(BASE_URL)
    Call<List<Review>> getAll();

    @GET(BASE_URL + "{id}")
    Call<List<Review>> getById(@Path("id") int id);

    @POST(BASE_URL)
    Call<Void> create(@Body Review review);

    @PUT(BASE_URL + "{id}")
    Call<Void> update(@Path("id") int id, @Body Review review);

    @DELETE(BASE_URL + "{id}")
    Call<Void> delete(@Path("id") int id);
}
