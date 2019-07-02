package com.pacote.appipet.Interface;

import com.pacote.appipet.Model.Animal;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetDataService {

    @GET("api/animal/findAll")
    Call<List<Animal>> getAllanimals();
}