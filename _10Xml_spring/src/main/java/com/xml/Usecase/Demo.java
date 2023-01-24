package com.xml.Usecase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xml.Model.Student;

public class Demo {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beanScopeContext.xml");
		Student s = ctx.getBean("s1", Student.class);
		System.out.println(s);
		System.out.println(s.calculatePercentage());
		
		
//		by using this techniq we can call destroy method beacause close() is not present in applicationContext
		ClassPathXmlApplicationContext ctx2= (ClassPathXmlApplicationContext)ctx;
		ctx2.close();

		
		
	}

}
