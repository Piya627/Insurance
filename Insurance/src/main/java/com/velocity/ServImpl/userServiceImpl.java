package com.velocity.ServImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.User;
import com.velocity.repository.userRepository;
import com.velocity.service.userSevice;

@Service
public class userServiceImpl implements userSevice{
	
	@Autowired
	private userRepository usrRepository;

	@Override
	public User saveUser(User user) {
		User user1=usrRepository.save(user);
		return user1;
	}
	
	

}
