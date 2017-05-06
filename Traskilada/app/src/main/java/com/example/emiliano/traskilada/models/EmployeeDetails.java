package com.example.emiliano.traskilada.models;

import java.util.List;

/**
 * Created by JoseLuis on 06/05/2017.
 */

public class EmployeeDetails extends BaseModel {

    private int userId;
    private List<WorkPlace> workplaces;
    private List<Service> services;
    private List<Appointment> appointments;
    private int workplaceId;
    private boolean isOwner;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public List<WorkPlace> getWorkplaces() {
        return workplaces;
    }

    public void setWorkplaces(List<WorkPlace> workplaces) {
        this.workplaces = workplaces;
    }

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(List<Appointment> appointments) {
        this.appointments = appointments;
    }

    public int getWorkplaceId() {
        return workplaceId;
    }

    public void setWorkplaceId(int workplaceId) {
        this.workplaceId = workplaceId;
    }

    public boolean isOwner() {
        return isOwner;
    }

    public void setOwner(boolean owner) {
        isOwner = owner;
    }
}
