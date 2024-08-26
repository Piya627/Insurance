package com.velocity.Insurance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.velocity.model")
public class InsuranceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InsuranceApplication.class, args);
	}

}
