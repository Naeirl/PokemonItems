package com.example.pokemonitems.Model;

import java.io.Serializable;
import java.util.List;

public class Attributes implements Serializable {
    private int id;
    private String name;
    private List<Description> descriptionList;

    public Attributes(int id, String name, List<Description> descriptionList) {
        this.id = id;
        this.name = name;
        this.descriptionList = descriptionList;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Description> getDescriptionList() {
        return descriptionList;
    }

    @Override
    public String toString() {
        return "Attributes{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", descriptionList=" + descriptionList +
                '}';
    }
}
