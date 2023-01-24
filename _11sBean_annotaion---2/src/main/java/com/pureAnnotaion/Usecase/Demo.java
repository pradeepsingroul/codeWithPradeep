package com.pureAnnotaion.Usecase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pureAnnotaion.Congiguration.configurationClass;
import com.pureAnnotaion.Model.Course;
import com.pureAnnotaion.Model.Student;

public class Demo {

	public static void main(String[] args) {
		
		ApplicationContext ctx= new AnnotationConfigApplicationContext(configurationClass.class);
		Student c = ctx.getBean("student",Student.class);
		System.out.println(c);
		System.out.println(c.getCourse());

		
	}
}
