package com.example.pokemonitems.Remote;

import com.example.pokemonitems.Model.Item;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitAPI {
    @GET("/item")
    Call<List<Item>> getItems();
}
