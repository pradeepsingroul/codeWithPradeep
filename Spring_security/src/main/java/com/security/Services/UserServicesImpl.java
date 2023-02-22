package com.security.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.security.Exceptions.UserException;
import com.security.Model.LoginDTO;
import com.security.Model.User;
import com.security.Repo.AddressRepository;
import com.security.Repo.UserRepository;

@Service
public class UserServicesImpl implements UserServices{

	@Autowired
	private UserRepository udao;
	
	@Autowired
	private AddressRepository adao;
	
	@Override
	public User registerUser(User user) throws UserException {
		// TODO Auto-generated method stub
		
		Optional<User> opt = udao.findById(user.getUserId());
		if(opt.isPresent()) {
			throw new UserException("User already exist in database with id");
		}else {
			return udao.save(user);
		}
	}

	@Override
	public User LoginUser(LoginDTO loginDto) throws UserException {
		// TODO Auto-generated method stub
		return null;
	}

}
