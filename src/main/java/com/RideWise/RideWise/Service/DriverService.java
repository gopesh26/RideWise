package com.RideWise.RideWise.Service;

import com.RideWise.RideWise.model.Drivers;
import java.util.*;

public class DriverService {
    public List<Drivers> driverList;

    public List<Drivers> getDriverList() {
        return driverList;
    }

    public Drivers addDriver (Drivers drivers){
        driverList.add(drivers);
        System.out.println("Driver added successfully");
        return drivers;
    }

    public void deleteDriverById(int id){
        for(Drivers driver: driverList){
            if(driver.getId()==id){
                driverList.remove(driver);
                System.out.println("Driver deleted successfully");
            }
        }
    }

    public Drivers getDriverById(int id){
        for (Drivers drivers : driverList) {
            if (drivers.getId() == id) {
                System.out.println("Driver found successfully");
                return drivers;
            }
        }
        System.out.println("Driver not found");
        return null;
    }

    public void updateDriver(Drivers drivers){
        for(Drivers driver: driverList){
            if(driver.getId()==drivers.getId()){
                driverList.remove(driver);
                driverList.add(drivers);
                System.out.println("Driver updated successfully");
            }
        }
    }

    public List<Drivers> getAvailableDriversAtLocation(String location){
         List<Drivers> listOfAvailableDrivers = new ArrayList<>();
         for (Drivers drivers : driverList) {
             if (drivers.getCurrentLocation().equals(location) && drivers.isAvailable()) {
                 listOfAvailableDrivers.add(drivers);
             }
         }
        return listOfAvailableDrivers;
    }
}
