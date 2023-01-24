package com.annotation.Usercase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.annotation.Model.Family;

public class Demo {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Family f = ctx.getBean("family",Family.class);
		f.printNames();
		
	}

}
