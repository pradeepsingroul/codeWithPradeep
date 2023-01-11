package com.masaifir.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masaifir.exception.CurrentUserException;
import com.masaifir.exception.FirException;
import com.masaifir.exception.UserException;
import com.masaifir.model.Fir;
import com.masaifir.service.FirService;



@RestController
public class FirController {
	
	@Autowired
	private FirService firService;
	
	@PostMapping("/addFir")
	public ResponseEntity<Fir> addUser(@RequestBody Fir fir, @RequestParam String uuid) throws UserException, CurrentUserException{
		
		Fir saveFir = this.firService.addFir(fir, uuid);
		
		return new ResponseEntity<Fir>(saveFir,HttpStatus.CREATED);
		
		
	}
	
	
	

}
