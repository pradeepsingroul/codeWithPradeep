package com.masai.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.masai.model.Address;
import com.masai.model.User;
import com.masai.repo.AddressRepo;
import com.masai.repo.UserRepo;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepo udao;
	
	@Autowired
	private AddressRepo adao;
	
	@Override
	public User registerUser(User user) {
		
		
		return udao.save(user);
		
		
	}

}
