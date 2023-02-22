package com.masai;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

	@GetMapping("/getMessage")
	public ResponseEntity<String> getMessageHandler(){
		String mes = "hey mr.welcome to my universe";
		return new ResponseEntity<String>(mes ,HttpStatus.CREATED);
	}
	
}
