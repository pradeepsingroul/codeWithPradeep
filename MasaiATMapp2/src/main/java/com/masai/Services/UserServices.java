package com.masai.Services;

import java.util.List;

import org.springframework.stereotype.Component;

import com.masai.Exceptions.AccountExceptions;
import com.masai.Exceptions.UserException;
import com.masai.Model.Account;
import com.masai.Model.LoginDTO;
import com.masai.Model.User;

@Component
public interface UserServices {

	User registerUserHandler(User user)throws UserException;
	
    User LoginUser(LoginDTO loginDto) throws UserException;
    
    String welcome() throws UserException;
    
    
}
