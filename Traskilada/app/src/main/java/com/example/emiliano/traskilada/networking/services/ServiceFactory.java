package com.example.emiliano.traskilada.networking.services;

import com.example.emiliano.traskilada.networking.serialization.EnumSerializer;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @author J. Pichardo
 */

public class ServiceFactory {


    private Gson gson;
    private Retrofit retrofit;
    private OkHttpClient okHttpClient;

    private OkHttpClient getOkHttpClientInstance() {
        if (okHttpClient == null) {
            final OkHttpClient.Builder builder = new OkHttpClient.Builder();
            final HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor()
                    .setLevel(HttpLoggingInterceptor.Level.BODY);

            builder.connectTimeout(60 * 1000, TimeUnit.MILLISECONDS)
                    .readTimeout(60 * 1000, TimeUnit.MILLISECONDS)
                    .addInterceptor(interceptor);
            okHttpClient = builder.build();
        }
        return okHttpClient;
    }

    private Gson getGsonInstance() {
        if (gson == null) {
            final GsonBuilder builder = new GsonBuilder()
                    .setDateFormat("yyyyMMddTHH:mmZ")
                    .setFieldNamingPolicy(FieldNamingPolicy.IDENTITY)
                    .registerTypeHierarchyAdapter(Enum.class, new EnumSerializer());
            gson = builder.create();
        }
        return gson;
    }

    private Retrofit getRetrofitInstance() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .addConverterFactory(GsonConverterFactory.create(getGsonInstance()))
                    .baseUrl("http://127.0.0.1:5000/api/")
                    .client(getOkHttpClientInstance())
                    .build();
        }

        return retrofit;
    }

    public AccountService getAccountService() {
        return getRetrofitInstance().create(AccountService.class);
    }

    public AppointmentService getAppointmentService() {
        return getRetrofitInstance().create(AppointmentService.class);
    }

    public ReviewService getReviewService() {
        return getRetrofitInstance().create(ReviewService.class);
    }

    public UserService getUserService() {
        return getRetrofitInstance().create(UserService.class);
    }

    public WorkPlaceService getWorkPlaceService() {
        return getRetrofitInstance().create(WorkPlaceService.class);
    }

}
