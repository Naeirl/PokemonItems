package com.example.pokemonitems.Repository;

import com.example.pokemonitems.Model.Item;

import java.util.List;

public interface IResponse {
    void getItemData(List<Item> items);
}
