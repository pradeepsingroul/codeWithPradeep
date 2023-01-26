package com.springBoot.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springBoot.Model.Student;

@RestController
@RequestMapping("/hellos")
public class StudentController {

	@GetMapping("/sayHello")
	public String sayHello() {
		return "welcome sir";
	}
	
	
	@GetMapping("/student")
	public Student student() {
		return new Student("pradeep", 125, 960);
	}
	
	@GetMapping("/getStudent/{roll}")
	public Student students(@PathVariable("roll") Integer roll) {
		return new Student("gfhg", roll, 960);
	}
	
	@GetMapping("/getStudent/{roll}/{name}")
	public Student studentsss(@PathVariable("roll") Integer roll,@PathVariable("name") String name) {
		return new Student(name, roll, 960);
	}
	
	@GetMapping("/getStudent")
	public Student studentss(@RequestParam Integer roll,@RequestParam String name) {
		return new Student(name, roll, 960);
	}
	
}
