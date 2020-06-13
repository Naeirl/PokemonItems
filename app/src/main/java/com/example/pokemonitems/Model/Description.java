package com.example.pokemonitems.Model;

import java.io.Serializable;

public class Description implements Serializable {
    private String description;

    public Description(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Description{" +
                "description='" + description + '\'' +
                '}';
    }
}
