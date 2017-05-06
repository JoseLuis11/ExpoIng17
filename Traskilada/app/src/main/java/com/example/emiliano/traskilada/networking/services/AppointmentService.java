package com.example.emiliano.traskilada.networking.services;

import com.example.emiliano.traskilada.models.Appointment;

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

public interface AppointmentService extends BaseService<Appointment> {

    String BASE_URL = "appointment/";

    @Override
    @GET(BASE_URL)
    Call<List<Appointment>> getAll();

    @Override
    @GET(BASE_URL + "{id}")
    Call<Appointment> getById(@Path("id") int id);

    @Override
    @POST(BASE_URL)
    Call<Void> create(@Body Appointment appointment);

    @Override
    @PUT(BASE_URL + "{id}")
    Call<Void> update(@Path("id") int id, @Body Appointment appointment);

    @Override
    @DELETE(BASE_URL + "{id}")
    Call<Void> delete(@Path("id") int id);

}
