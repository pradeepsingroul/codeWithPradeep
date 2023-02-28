package com.masai.Services;

import java.util.List;

import org.springframework.stereotype.Component;

import com.masai.Exceptions.UserException;
import com.masai.Model.LoginDTO;
import com.masai.Model.User;

@Component
public interface UserServices {

	User registerUserHandler(User user)throws UserException;
	
    User LoginUser(LoginDTO loginDto) throws UserException;
	
    List<User> getSortedUser(String paramenter ,String order) throws UserException;
    
    List<User> getParticularPageList(Integer pages ,Integer nuOfPages) throws UserException;
    
    List<User> getparticularPageBySorted(Integer pages ,Integer nuOfPages,String field, String order) throws UserException;
    
	
}
