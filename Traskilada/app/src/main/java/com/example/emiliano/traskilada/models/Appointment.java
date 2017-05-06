package com.example.emiliano.traskilada.models;

import java.util.Date;
import java.util.List;

/**
 * Created by JoseLuis on 06/05/2017.
 */

public class Appointment extends BaseModel {

    private Date date;
    private int employeeId;
    private int clientId;
    private List<Service> services;

    public Date getDate() {
        return date;
    }

    public Appointment setDate(Date date) {
        this.date = date;
        return this;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public Appointment setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
        return this;
    }

    public int getClientId() {
        return clientId;
    }

    public Appointment setClientId(int clientId) {
        this.clientId = clientId;
        return this;
    }

    public List<Service> getServices() {
        return services;
    }

    public Appointment setServices(List<Service> services) {
        this.services = services;
        return this;
    }
}
