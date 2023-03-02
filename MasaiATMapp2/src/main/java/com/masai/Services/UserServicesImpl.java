package com.masai.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.stereotype.Service;

import com.masai.Exceptions.UserException;
import com.masai.Model.LoginDTO;
import com.masai.Model.User;
import com.masai.Repository.UserRepository;



@Service
public  class UserServicesImpl implements UserServices{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User registerUserHandler(User user) throws UserException {
		Optional<User> opt = userRepository.findByEmail(user.getEmail());
		if(opt.isPresent()) {
			throw new UserException("User already exist in database with id");
		}else {
			return userRepository.save(user);
		}
	}

	@Override
	public User LoginUser(LoginDTO loginDto) throws UserException {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public String welcome() throws UserException {
		return "wel-come to our bank! tell me how can I help you";
	}
	
	
}
