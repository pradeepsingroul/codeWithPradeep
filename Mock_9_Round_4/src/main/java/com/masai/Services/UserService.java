package com.masai.Services;

import com.masai.Exceptions.UserExceptions;
import com.masai.model.LoginDTO;
import com.masai.model.User;


public interface UserService {
	
	    public User registerUser(User user) throws UserExceptions ;
		
		public User loginUser(LoginDTO user) throws UserExceptions;
		
//		public User loginUser(LoginDTO user) throws UserExceptions;

		
		
		
		
		
		
		
}
