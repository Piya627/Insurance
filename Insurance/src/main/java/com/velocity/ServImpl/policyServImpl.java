package com.velocity.ServImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.Policy;
import com.velocity.repository.policyRepository;
import com.velocity.service.PolicyService;


@Service
public class policyServImpl implements PolicyService {
	
	@Autowired
   private policyRepository plcyRepository;
	@Override
	public Policy savePolicy(Policy policy) {
	  
		Policy policy1=plcyRepository.save(policy);
		return policy1;
	}
	
	

}
