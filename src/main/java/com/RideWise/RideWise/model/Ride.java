package com.RideWise.RideWise.model;


public class Ride {
   private int id;
    private Riders rider;
    private Drivers driver;
    private int distance;
    private RideStatus status = RideStatus.ACCEPTED;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public RideStatus getStatus() {
        return status;
    }

    public void setStatus(RideStatus status) {
        this.status = status;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public Drivers getDriver() {
        return driver;
    }

    public void setDriver(Drivers driver) {
        this.driver = driver;
    }

    public Riders getRider() {
        return rider;
    }

    public void setRider(Riders rider) {
        this.rider = rider;
    }

    public Ride(int id, Riders rider, Drivers driver, int distance, RideStatus status) {
        this.id = id;
        this.rider = rider;
        this.driver = driver;
        this.distance = distance;
        this.status = status;
    }

}
