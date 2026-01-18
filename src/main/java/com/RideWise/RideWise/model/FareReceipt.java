package com.RideWise.RideWise.model;

import java.util.Date;

public class FareReceipt {
    private int rideId;
    private int amount;
    private Date generatedAt;

    public FareReceipt(int rideId, Date generatedAt, int amount) {
        this.rideId = rideId;
        this.generatedAt = generatedAt;
        this.amount = amount;
    }

    public Date getGeneratedAt() {
        return generatedAt;
    }

    public void setGeneratedAt(Date generatedAt) {
        this.generatedAt = generatedAt;
    }

    public int getRideId() {
        return rideId;
    }

    public void setRideId(int rideId) {
        this.rideId = rideId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }


}
