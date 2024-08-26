package com.velocity.ServImpl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.velocity.model.PolicyPremiun;
import com.velocity.repository.policyPremRepository;

import com.velocity.service.PolicyPremiumService;


@Service
public class policyPremServImpl implements PolicyPremiumService{
	
	@Autowired
	private policyPremRepository PolicypremRepository;

	@Override
	public PolicyPremiun savePolicyPrem(PolicyPremiun policypremium) {
	  
		PolicyPremiun policypremium1=PolicypremRepository.save(policypremium);
		return policypremium1;
	}
	

}
