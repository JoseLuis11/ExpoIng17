package com.example.emiliano.traskilada.models;

/**
 * Created by JoseLuis on 06/05/2017.
 */

public class Review extends BaseModel{

    private double rating;
    private String message;
    private int userId;
    private int workplaceId;

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getWorkplaceId() {
        return workplaceId;
    }

    public void setWorkplaceId(int workplaceId) {
        this.workplaceId = workplaceId;
    }
}
