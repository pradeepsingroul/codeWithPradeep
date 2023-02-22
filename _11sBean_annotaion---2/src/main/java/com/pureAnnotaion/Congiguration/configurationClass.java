package com.pureAnnotaion.Congiguration;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

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
	
	@Bean(name = "course1")
	public Course getCourse1() {
		Course c = new Course();
		c.setCourseName("full stack web developement");
		c.setTeacher("Ratan sir");
		c.setLct(LocalTime.now());
		return c;
	}
	@Bean(name = "course2")
	public Course getCourse2() {
		Course c = new Course();
		c.setCourseName("full stack web developement");
		c.setTeacher("Ratan sir");
		c.setLct(LocalTime.now());
		return c;
	}
	@Bean(name = "course3")
	public Course getCourse3() {
		Course c = new Course();
		c.setCourseName("full stack web developement");
		c.setTeacher("Ratan sir");
		c.setLct(LocalTime.now());
		return c;
	}
	@Bean(name = "course4")
	public Course getCourse4() {
		Course c = new Course();
		c.setCourseName("full stack web developement");
		c.setTeacher("Ratan sir");
		c.setLct(LocalTime.now());
		return c;
	}
	
	@Bean("student")
	public Student getStudent() {
		Student s = new Student();
		return s;
	}
	
	
	@Bean("courseList")
	public List<Course> getList(){
		
		List<Course> courses = new ArrayList<>();
		courses.add(getCourse1());
		courses.add(getCourse2());
		courses.add(getCourse3());
		courses.add(getCourse4());
		
		return  courses;
		
		
	}
	
	

}
