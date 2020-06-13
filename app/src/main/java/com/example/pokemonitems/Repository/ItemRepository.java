package com.example.pokemonitems.Repository;

import android.app.Application;

import com.example.pokemonitems.Model.Item;

import java.util.List;

public class ItemRepository implements IResponse {
    private static ItemRepository INSTANCE;

    public ItemRepository(Application application) {

    }

    public static ItemRepository getInstance(Application application){
        if (INSTANCE == null) {
            INSTANCE = new ItemRepository(application);
        }
        return INSTANCE;
    }

    @Override
    public void getItemData(List<Item> items) {

    }
}
