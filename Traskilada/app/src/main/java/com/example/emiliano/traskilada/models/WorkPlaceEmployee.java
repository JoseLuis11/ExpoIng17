package com.example.emiliano.traskilada.models;

/**
 * Created by JoseLuis on 06/05/2017.
 */

public class WorkPlaceEmployee {

    private int userId;
    private int workplaceId;

    public int getUserId() {
        return userId;
    }

    public WorkPlaceEmployee setUserId(int userId) {
        this.userId = userId;
        return this;
    }

    public int getWorkplaceId() {
        return workplaceId;
    }

    public WorkPlaceEmployee setWorkplaceId(int workplaceId) {
        this.workplaceId = workplaceId;
        return this;
    }
}
