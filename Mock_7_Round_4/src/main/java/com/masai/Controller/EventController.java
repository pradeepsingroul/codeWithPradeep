package com.masai.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Modle.Event;
import com.masai.Modle.LoginDto;
import com.masai.Modle.User;
import com.masai.Services.EventServices;

@RestController
@RequestMapping("/masaicalender")
public class EventController {
	
	@Autowired
	private EventServices eventServices;
	
	
	@PostMapping("/event")
	public ResponseEntity<Event> createEvents(@RequestBody Event event){
	
		Event u = eventServices.registerEvent(event);
		return new ResponseEntity<Event>(u,HttpStatus.OK);
		
	}
	
	@PutMapping("/events")
	public ResponseEntity<Event> updateUserCredential(@RequestBody Event event){
	
		Event u = eventServices.updateEvent(event);
		return new ResponseEntity<Event>(u,HttpStatus.OK);
	}
	
	

}
