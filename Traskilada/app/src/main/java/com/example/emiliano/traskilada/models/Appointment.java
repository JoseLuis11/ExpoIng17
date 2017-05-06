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

    public void setDate(Date date) {
        this.date = date;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }
}
