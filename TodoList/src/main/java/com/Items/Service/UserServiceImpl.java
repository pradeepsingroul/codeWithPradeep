package com.Items.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Items.Exceptions.UserException;
import com.Items.Model.User;
import com.Items.Repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository udao;

	@Override
	public User registerUser(User user) throws UserException {
		// TODO Auto-generated method stub
		return udao.save(user);
	}

	@Override
	public User loginUser(User user) throws UserException {
		// TODO Auto-generated method stub
		return null;
	}

}
