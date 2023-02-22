package com.Items.Service;

import org.springframework.stereotype.Service;

import com.Items.Exceptions.UserException;
import com.Items.Model.User;


public interface UserService {
	
	public User registerUser(User user) throws UserException;
	
	public User loginUser(User user) throws UserException;
	

}
