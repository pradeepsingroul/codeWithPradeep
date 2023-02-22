package com.springBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springBoot.Model.Student;
import com.springBoot.Repository.Addressdao;
import com.springBoot.Repository.Departmentdao;
import com.springBoot.Services.StudentServicess;

@RestController
public class Controller {
	
	@Autowired
	private StudentServicess sdao;
	
	@Autowired
	private Departmentdao ddao;
	
	@Autowired
	private Addressdao adao;
	
	
	@PostMapping("/students")
	public ResponseEntity<Student> registerStudent(@RequestBody Student s){
		
		Student s1 = sdao.register(s);
		return new ResponseEntity<Student>(s1,HttpStatus.OK);
		
	}
	
	
	@DeleteMapping("/students/{sid}")
	public ResponseEntity<Student> deletestudent(@PathVariable("sid") Integer sid){
		
		Student s1 = sdao.delete(sid);
		return new ResponseEntity<Student>(s1,HttpStatus.OK);
		
	}
	

}
