package com.velocity.controller;


	import com.velocity.model.Driver;
	import com.velocity.service.DriverService;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.http.ResponseEntity;
	import org.springframework.web.bind.annotation.*;

	import java.util.List;
	import java.util.Optional;

	@RestController
	@RequestMapping("/api/entity2")
	public class DriverController {

	    @Autowired
	    private DriverService driverService;

	    @PostMapping("/save")
	    public Driver createDriver(@RequestBody Driver driver) {
	        return driverService.saveDriver(driver);
	    }

	    @PutMapping("/{id}")
	    public ResponseEntity<Driver> updateDriver(@PathVariable Integer id, @RequestBody Driver driverDetails) {
	        Driver updatedDriver = driverService.updateDriver(id, driverDetails);
	        if (updatedDriver != null) {
	            return ResponseEntity.ok(updatedDriver);
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	    }

	    @GetMapping("/getdriver")
	    public List<Driver> getAllDrivers() {
	        return driverService.getAllDrivers();
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<Driver> getDriverById(@PathVariable Integer id) {
	        Optional<Driver> driver = driverService.getDriverById(id);
	        if (driver.isPresent()) {
	            return ResponseEntity.ok(driver.get());
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteDriver(@PathVariable Integer id) {
	        driverService.deleteDriver(id);
	        return ResponseEntity.ok().build();
	    }
	}

