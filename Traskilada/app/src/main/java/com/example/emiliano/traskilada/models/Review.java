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

    public Review setRating(double rating) {
        this.rating = rating;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public Review setMessage(String message) {
        this.message = message;
        return this;
    }

    public int getUserId() {
        return userId;
    }

    public Review setUserId(int userId) {
        this.userId = userId;
        return this;
    }

    public int getWorkplaceId() {
        return workplaceId;
    }

    public Review setWorkplaceId(int workplaceId) {
        this.workplaceId = workplaceId;
        return this;
    }
}
