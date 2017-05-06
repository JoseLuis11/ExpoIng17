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

    public EmployeeDetails setUserId(int userId) {
        this.userId = userId;
        return this;
    }

    public List<WorkPlace> getWorkplaces() {
        return workplaces;
    }

    public EmployeeDetails setWorkplaces(List<WorkPlace> workplaces) {
        this.workplaces = workplaces;
        return this;
    }

    public List<Service> getServices() {
        return services;
    }

    public EmployeeDetails setServices(List<Service> services) {
        this.services = services;
        return this;
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public EmployeeDetails setAppointments(List<Appointment> appointments) {
        this.appointments = appointments;
        return this;
    }

    public int getWorkplaceId() {
        return workplaceId;
    }

    public EmployeeDetails setWorkplaceId(int workplaceId) {
        this.workplaceId = workplaceId;
        return this;
    }

    public boolean isOwner() {
        return isOwner;
    }

    public EmployeeDetails setOwner(boolean owner) {
        isOwner = owner;
        return this;
    }
}
