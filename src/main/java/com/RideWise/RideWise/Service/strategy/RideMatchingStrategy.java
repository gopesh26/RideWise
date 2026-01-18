package com.RideWise.RideWise.Service.strategy;

import com.RideWise.RideWise.model.Riders;

import java.sql.Driver;
import java.util.List;

public interface RideMatchingStrategy {
    Driver findDriver(Riders rider, List<Driver> drivers);
}
