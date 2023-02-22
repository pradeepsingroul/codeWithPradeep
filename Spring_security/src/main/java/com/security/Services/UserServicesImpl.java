package com.security.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.security.Exceptions.UserException;
import com.security.Model.LoginDTO;
import com.security.Model.CustomerUser;
import com.security.Repo.AddressRepository;
import com.security.Repo.UserRepository;

@Service
public class UserServicesImpl implements UserServices{

	@Autowired
	private UserRepository udao;
	
	@Autowired
	private AddressRepository adao;
	
	@Override
	public CustomerUser registerUser(CustomerUser user) throws UserException {
		// TODO Auto-generated method stub
		
		Optional<CustomerUser> opt = udao.findById(user.getUserId());
		if(opt.isPresent()) {
			throw new UserException("User already exist in database with id");
		}else {
			return udao.save(user);
		}
	}

	@Override
	public CustomerUser LoginUser(LoginDTO loginDto) throws UserException {
		// TODO Auto-generated method stub
		return null;
	}

}
