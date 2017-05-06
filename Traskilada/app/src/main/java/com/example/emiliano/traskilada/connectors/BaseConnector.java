package com.example.emiliano.traskilada.connectors;

import com.example.emiliano.traskilada.models.BaseModel;
import com.example.emiliano.traskilada.networking.services.BaseService;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * @author J. Pichardo
 */

public class BaseConnector<T extends BaseModel> {

    private final BaseService<T> service;

    private Callback<Void> createCallback;
    private Callback<Void> updateCallback;
    private Callback<Void> removeCallback;


    protected BaseConnector(BaseService<T> service) {
        this.service = service;
    }

    //region Service Wrapper Methods
    public T getById(int id) {
        return execute(service.getById(id));
    }

    public List<T> getAll() {
        return (execute(service.getAll()));
    }

    public void save(T t) {
        if (t.getId() == 0) executeAsync(service.create(t), createCallback);
        else executeAsync(service.update(t.getId(), t), updateCallback);
    }

    public void delete(T t) {
        executeAsync(service.delete(t.getId()), removeCallback);
    }
    //endregion


    public BaseConnector setCreateCallback(Callback<Void> createCallback) {
        this.createCallback = createCallback;
        return this;
    }

    public BaseConnector setUpdateCallback(Callback<Void> updateCallback) {
        this.updateCallback = updateCallback;
        return this;
    }

    public BaseConnector setRemoveCallback(Callback<Void> removeCallback) {
        this.removeCallback = removeCallback;
        return this;
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

    protected static <R> void executeAsync(Call<R> call, Callback<R> callback) {
        call.enqueue(callback);
    }

}
