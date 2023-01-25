package com.springBoot.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@GetMapping("/sayHello")
	public String sayHello() {
		return "welcome sir";
	}
	
}
