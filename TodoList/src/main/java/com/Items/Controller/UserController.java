package com.Items.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Items.Model.User;
import com.Items.Service.UserService;

@RestController
@RequestMapping("/todoTask")
public class UserController {

	@Autowired
	private UserService us;
	
	@PostMapping("/register")
	public ResponseEntity<User> registerUser(@RequestBody User u){
		User user = us.registerUser(u);
		return new ResponseEntity<User>(user,HttpStatus.CREATED);
	}
	
}
