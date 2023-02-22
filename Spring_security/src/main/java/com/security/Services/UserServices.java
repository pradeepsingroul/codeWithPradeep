package com.security.Services;

import com.security.Exceptions.UserException;
import com.security.Model.LoginDTO;
import com.security.Model.CustomerUser;

public interface UserServices {

	public CustomerUser registerUser(CustomerUser user) throws UserException;
	
	public CustomerUser LoginUser(LoginDTO loginDto) throws UserException;
	
}
