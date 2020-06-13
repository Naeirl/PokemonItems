package com.example.pokemonitems.Model;

import java.io.Serializable;
import java.util.List;

public class Item implements Serializable {
    private int id;
    private String name;
    private int cost;
    private List<Attributes> attributes;
    private List<Category> category;

    public Item(int id, String name, int cost, List<Attributes> attributes, List<Category> category) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.attributes = attributes;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public List<Attributes> getAttributes() {
        return attributes;
    }

    public List<Category> getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", attributes=" + attributes +
                ", category=" + category +
                '}';
    }
}
