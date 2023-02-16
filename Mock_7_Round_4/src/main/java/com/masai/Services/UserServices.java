package com.masai.Services;

import java.util.List;

import org.w3c.dom.events.EventException;

import com.masai.Exceptions.UserExceptions;
import com.masai.Modle.Event;
import com.masai.Modle.LoginDto;
import com.masai.Modle.User;



public interface UserServices {
	
    public User registerUser(User user) throws UserExceptions ;
	
	public User loginUser(LoginDto user) throws UserExceptions;
	
	public List<Event> getEvents(String email) throws EventException ;
	
	public List<Event> getEventsByType(String type) throws EventException ;

	public User updateUserCreadentials(User u) throws UserExceptions;

}
