package com.example.emiliano.traskilada.models;

import java.util.Date;

/**
 * Created by JoseLuis on 06/05/2017.
 */

public class CashOut extends BaseModel{

    private double amount;
    private Date date;
    private int userId;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}