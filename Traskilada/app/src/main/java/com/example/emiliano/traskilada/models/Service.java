package com.example.emiliano.traskilada.models;

/**
 * Created by JoseLuis on 06/05/2017.
 */

public class Service extends BaseModel{

    private String name;
    private String description;

    public String getName() {
        return name;
    }

    public Service setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Service setDescription(String description) {
        this.description = description;
        return this;
    }
}
