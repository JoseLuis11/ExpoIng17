package com.example.emiliano.traskilada.models;

/**
 * Created by JoseLuis on 06/05/2017.
 */

public class AppointmentList {

    private String userName;
    private String service;


    public AppointmentList(String userName, String service) {
        this.userName = userName;
        this.service = service;
    }

    public String getUserName() {
        return userName;
    }

    public AppointmentList setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getService() {
        return service;
    }

    public AppointmentList setService(String service) {
        this.service = service;
        return this;
    }
}
