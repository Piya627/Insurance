package com.velocity.ServImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.Driver;
import com.velocity.repository.DriverRepository;
import com.velocity.service.DriverService;

@Service
public class DriverServiceImpl implements DriverService {

	@Autowired
	private DriverRepository driverRepository;

	@Override
	public Driver saveDriver(Driver driver) {
		Driver dr = driverRepository.save(driver);
		return dr;
	}

	@Override
	public Driver updateDriver(Integer id, Driver driver) {
		Optional<Driver> optionalDriver = driverRepository.findById(id);
		if (optionalDriver.isPresent()) {
			Driver dvr = optionalDriver.get();
			driver.setName(driver.getName());
			driver.setLicense(driver.getLicense());
			driver.setMobileNum(driver.getMobileNum());
			driver.setCity(driver.getCity());
			return driverRepository.save(driver);

		}
		return null;
	}

	@Override
	public List<Driver> getAllDrivers() {
		List<Driver> listDriver = driverRepository.findAll();
		return listDriver;
	}

	@Override
	public Optional<Driver> getDriverById(Integer id) {
		Optional<Driver> od = driverRepository.findById(id);
		return od;
	}

	@Override
	public void deleteDriver(Integer id) {
		driverRepository.deleteById(id);

	}

}