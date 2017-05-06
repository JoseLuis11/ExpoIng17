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

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getEmployeeDetailId() {
        return employeeDetailId;
    }

    public void setEmployeeDetailId(int employeeDetailId) {
        this.employeeDetailId = employeeDetailId;
    }

    public EmployeeDetails getEmployeeDetails() {
        return employeeDetails;
    }

    public void setEmployeeDetails(EmployeeDetails employeeDetails) {
        this.employeeDetails = employeeDetails;
    }
}
