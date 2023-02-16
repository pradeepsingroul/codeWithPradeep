package com.masai.Services;

import org.springframework.stereotype.Repository;

import com.masai.Exceptions.EventExceptions;
import com.masai.Modle.Event;

@Repository
public interface EventServices {
	
	public Event registerEvent(Event event) throws EventExceptions ;

	public Event updateEvent(Event event) throws EventExceptions ;
	
	public Event deletEvent(int id) throws EventExceptions ;
}
