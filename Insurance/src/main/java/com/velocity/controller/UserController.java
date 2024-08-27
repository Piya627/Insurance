package com.velocity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.model.Policy;
import com.velocity.model.PolicyPremiun;
import com.velocity.model.User;
import com.velocity.service.PolicyPremiumService;
import com.velocity.service.PolicyService;

import com.velocity.service.UserService;

@RestController
@RequestMapping("/api/entity1")
public class UserController {
	@Autowired
	private UserService userservice;

	
	@PostMapping("/saveuserpolicy")
	public User saveUser(@RequestBody User user) {

		User user1 = userservice.saveUser(user);
		
		return user1;
	}
	
	

	
}
