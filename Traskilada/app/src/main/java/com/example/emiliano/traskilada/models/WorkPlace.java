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

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<User> getEmployees() {
        return employees;
    }

    public void setEmployees(List<User> employees) {
        this.employees = employees;
    }
}
