package com.velocity.service;

import java.util.List;
import java.util.Optional;

import com.velocity.model.Driver;

public interface DriverService {
public	Driver saveDriver(Driver driver);
public	Driver updateDriver(Integer id,Driver driver);
List<Driver>getAllDrivers();
Optional<Driver>getDriverById(Integer id);
public void deleteDriver(Integer id);


}