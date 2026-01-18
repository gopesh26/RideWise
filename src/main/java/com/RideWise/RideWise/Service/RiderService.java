package com.RideWise.RideWise.Service;

import com.RideWise.RideWise.model.Riders;

import java.util.ArrayList;
import java.util.List;

public class RiderService {
    public List<Riders> riderList;

    public List<Riders> getRiderList() {
        return riderList;
    }

    public Riders addRider (Riders riders){
        riderList.add(riders);
        System.out.println("Rider added successfully");
        return riders;
    }

    public Riders getRiderById(int id){
        for (Riders riders : riderList) {
            if (riders.getId() == id) {
                System.out.println("Rider found successfully");
                return riders;
            }
        }
        System.out.println("Rider not found");
        return null;
    }

    public void deleteRiderById(int id){
        for(Riders rider: riderList){
            if(rider.getId()==id){
                riderList.remove(rider);
                System.out.println("Rider deleted successfully");
            }
        }
    }

    public void updateRider(Riders riders){
        for(Riders rider: riderList){
            if(rider.getId()==riders.getId()){
                riderList.remove(rider);
                riderList.add(riders);
                System.out.println("Rider updated successfully");
            }
        }
    }

    public List<Riders> getRidersByLocation(String location){
       List<Riders> listOfRiderByLocation = new ArrayList<>();
        for (Riders riders : riderList) {
            if (riders.getLocation().equals(location)) {
                System.out.println("Rider found successfully");
                listOfRiderByLocation.add(riders);
            }
        }
        return listOfRiderByLocation;
    }
}
