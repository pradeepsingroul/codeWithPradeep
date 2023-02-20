package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Services.AddressServices;
import com.masai.Services.UserService;
import com.masai.model.Address;
import com.masai.model.User;

@RestController
@RequestMapping("/user")
public class UserController {
	
	
	@Autowired
	private UserService us;
	
	@Autowired
	private AddressServices as;
	
	@PostMapping("/register")
	public ResponseEntity<User> register(@RequestBody User user) {
		
		User u = us.registerUser(user);
		
		return new ResponseEntity<User>(user,HttpStatus.CREATED);
		
	}
	
	@PostMapping("/registerAddress")
	public ResponseEntity<Address> register(@RequestBody Address address) {
		
		Address u = as.registerAddress(address);
		
		return new ResponseEntity<Address>(u,HttpStatus.CREATED);
		
	}

}
