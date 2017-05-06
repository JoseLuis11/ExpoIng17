package com.example.emiliano.traskilada.networking.services;

import java.util.List;

import retrofit2.Call;

/**
 * @author J. Pichardo
 */

public interface BaseService<T> {

    Call<List<T>> getAll();

    Call<T> getById(int id);

    Call<Void> create(T t);

    Call<Void> update(int id, T t);

    Call<Void> delete(int id);

}
