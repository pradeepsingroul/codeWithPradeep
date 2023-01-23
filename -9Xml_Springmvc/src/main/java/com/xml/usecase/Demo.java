package com.xml.usecase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xml.Model.Student;

public class Demo {

	public static void main(String[] args) {
		
		//Activatting IOC container by using applicationContex
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		//Pulling you Student object from IOC container..
		Student s = ctx.getBean("student",Student.class);
		Student s1 = ctx.getBean("student1",Student.class);
		
		Student sByCustuctorArgs = ctx.getBean("student3" , Student.class);
		System.out.println(sByCustuctorArgs);
		System.out.println(s);
		System.out.println(s1);
		
	}
}
