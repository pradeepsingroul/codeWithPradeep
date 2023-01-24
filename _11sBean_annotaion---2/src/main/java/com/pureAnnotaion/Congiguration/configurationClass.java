package com.pureAnnotaion.Congiguration;

import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.pureAnnotaion.Model.Course;
import com.pureAnnotaion.Model.Student;

//@ComponentScan(basePackages = "com.pureAnnotaion")

@Configuration
//if we have multiple base packages than we can use this kind of syntax 
@ComponentScan(basePackages =  {"com.pureAnnotation" , "com.masai"})
public class configurationClass {
	
	@Bean(name = "course")
	public Course getCourse() {
		Course c = new Course();
		c.setCourseName("full stack web developement");
		c.setTeacher("Ratan sir");
		c.setLct(LocalTime.now());
		return c;
	}
	
	@Bean(name = "student")
	public Student getStudent() {
		Student s =  new Student();
		s.setCourse(getCourse());
		return s;
	}
	
	

}
