package com.masai.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Modle.Event;
import com.masai.Modle.LoginDto;
import com.masai.Modle.User;
import com.masai.Services.UserServices;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/masaicalender")
public class UserController {
	
	@Autowired
	private UserServices us;
	
//	@Autowired
//	private userService us
	
	@PostMapping("/register")
	public ResponseEntity<User> registerEntity(@Valid @RequestBody User user){
	
		User u = us.registerUser(user);
		return new ResponseEntity<User>(u,HttpStatus.CREATED);
	}
	
	@PostMapping("/login")
	public ResponseEntity<User> loginEntity(@Valid @RequestBody LoginDto lDto){
	
		User u = us.loginUser(lDto);
		return new ResponseEntity<User>(u,HttpStatus.OK);
	}
	
	@PutMapping("/user")
	public ResponseEntity<User> updateUserCredential(@Valid @RequestBody User user){
	
		User u = us.updateUserCreadentials(user);
		return new ResponseEntity<User>(u,HttpStatus.OK);
	}
	
	@GetMapping("/event/{type}")
	public ResponseEntity<List<Event>> getBlogsEntity(@PathVariable("type") String type){
	
		List<Event> lst = us.getEventsByType(type);
		return new ResponseEntity<List<Event>>(lst,HttpStatus.OK);
	}
	
    
}
