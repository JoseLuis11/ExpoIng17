package com.example.emiliano.traskilada.models;

/**
 * Created by JoseLuis on 06/05/2017.
 */

public class User extends BaseModel {

    private String name;
    private String lastName;
    private String phoneNumber;
    private int employeeDetailId;
    private EmployeeDetails employeeDetails;

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public User setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public User setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public int getEmployeeDetailId() {
        return employeeDetailId;
    }

    public User setEmployeeDetailId(int employeeDetailId) {
        this.employeeDetailId = employeeDetailId;
        return this;
    }

    public EmployeeDetails getEmployeeDetails() {
        return employeeDetails;
    }

    public User setEmployeeDetails(EmployeeDetails employeeDetails) {
        this.employeeDetails = employeeDetails;
        return this;
    }
}
