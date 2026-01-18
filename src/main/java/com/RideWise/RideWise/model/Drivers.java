package com.RideWise.RideWise.model;

public class Drivers {
    private int id;
    private String name;
    private String currentLocation;
    private boolean available = true;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Drivers(int id, String name, String currentLocation, boolean available) {
        this.id = id;
        this.name = name;
        this.currentLocation = currentLocation;
        this.available = available;
    }
}
