package com.velocity.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.model.Policy;
import com.velocity.model.PolicyPremiun;
import com.velocity.model.User;
import com.velocity.service.PolicyPremiumService;
import com.velocity.service.PolicyService;

import com.velocity.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userservice;
	
	@Autowired
	private PolicyService policyservice;
	
	@Autowired
	private PolicyPremiumService policypremiumservice;

	@PostMapping("/saveUserPolicyPremium")
	public User saveUser(User user) {

		User user1 = userservice.saveUser(user);
		List<Policy> policies=user.getPolicylist();
		List<PolicyPremiun> premium=user.getPolicypremiumlist();
		for(Policy policy:policies) {
			policy.setUserid(user.getUserId());
			policyservice.savePolicy(policy);
		}
		
		for(PolicyPremiun prem:premium) {
			prem.setUserid(user.getUserId());
			policypremiumservice.savePolicyPrem(prem);
			
		}
		return user1;
	}
}
