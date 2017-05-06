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

    public CashOut setAmount(double amount) {
        this.amount = amount;
        return this;
    }

    public Date getDate() {
        return date;
    }

    public CashOut setDate(Date date) {
        this.date = date;
        return this;
    }

    public int getUserId() {
        return userId;
    }

    public CashOut setUserId(int userId) {
        this.userId = userId;
        return this;
    }
}