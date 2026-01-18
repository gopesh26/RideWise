package com.RideWise.RideWise.Service;
import com.RideWise.RideWise.model.Drivers;
import com.RideWise.RideWise.model.Riders;

import java.util.ArrayList;
import java.util.List;

public class RideService {
    public List<RideService> currentRides;
    public List<RideService> completedRides;

    public List<RideService> getCurrentRides() {
        return currentRides;
    }

    public List<RideService> getCompletedRides() {
        return completedRides;
    }

    public void bookARide(Drivers driver, Riders rider, int distance){
        RideService ride = new RideService();
        ride.currentRides.add(ride);
        System.out.println("Ride booked successfully");
    }
}
