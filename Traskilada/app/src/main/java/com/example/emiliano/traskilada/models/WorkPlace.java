package com.example.emiliano.traskilada.models;

import java.util.List;

/**
 * Created by JoseLuis on 06/05/2017.
 */

public class WorkPlace extends BaseModel{

    private String name;
    private String address;
    private List<User> employees;

    public String getName() {
        return name;
    }

    public WorkPlace setName(String name) {
        this.name = name;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public WorkPlace setAddress(String address) {
        this.address = address;
        return this;
    }

    public List<User> getEmployees() {
        return employees;
    }

    public WorkPlace setEmployees(List<User> employees) {
        this.employees = employees;
        return this;
    }
}
