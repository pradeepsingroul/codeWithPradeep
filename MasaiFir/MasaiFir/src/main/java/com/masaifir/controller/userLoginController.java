package com.masaifir.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masaifir.dto.LoginDto;
import com.masaifir.exception.CurrentUserException;
import com.masaifir.exception.UserException;
import com.masaifir.model.CurrentSessionUsers;
import com.masaifir.service.UserLoginService;


@RestController
public class userLoginController {
	
	@Autowired
	private UserLoginService userLoginService;
	
	@PostMapping("/loginUSer")
	public ResponseEntity<CurrentSessionUsers> loginUser(@RequestBody LoginDto loginDto) throws CurrentUserException, UserException{
		
		CurrentSessionUsers savecuCurrentSessionUsers = this.userLoginService.loginUser(loginDto);
		
		return new ResponseEntity<CurrentSessionUsers>(savecuCurrentSessionUsers,HttpStatus.ACCEPTED);
	}
}
