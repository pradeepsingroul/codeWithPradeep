package com.masai.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Model.User;
import com.masai.Repository.UserRepository;


@RestController
@RequestMapping("/masaiAtm/user")
public class LoginController {
	
	@Autowired
	private UserRepository userRepository;

	
	@PostMapping("/login")
	public ResponseEntity<User> registerUserHandler(Authentication auth ){

		User user = userRepository.findByEmail(auth.getName()).orElseThrow(() -> new BadCredentialsException("user is not autenticayed..."));
		
		return new ResponseEntity<User>(user ,HttpStatus.CREATED);
		
	}

}
