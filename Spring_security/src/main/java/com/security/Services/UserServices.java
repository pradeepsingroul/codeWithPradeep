package com.security.Services;

import com.security.Exceptions.UserException;
import com.security.Model.LoginDTO;
import com.security.Model.User;

public interface UserServices {

	public User registerUser(User user) throws UserException;
	
	public User LoginUser(LoginDTO loginDto) throws UserException;
	
}
