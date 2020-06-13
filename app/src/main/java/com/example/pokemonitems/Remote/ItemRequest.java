package com.example.pokemonitems.Remote;

import android.util.Log;

import com.example.pokemonitems.Model.Item;
import com.example.pokemonitems.Repository.IResponse;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ItemRequest {
    public void getListOfItems(final IResponse callback){
        Gson gson = new GsonBuilder()
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://pokeapi.co/api/v2")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        RetrofitAPI client = retrofit.create(RetrofitAPI.class);

        Call<List<Item>> call = client.getItems();

        call.enqueue(new Callback<List<Item>>() {
            @Override
            public void onResponse(Call<List<Item>> call, Response<List<Item>> response) {
                Log.d("Response", response.body().toString());
                // here
                callback.getItemData(response.body());
            }
            @Override
            public void onFailure(Call<List<Item>> call, Throwable t) {
                Log.d("fail", t.getMessage());
            }
        });
    }
}
