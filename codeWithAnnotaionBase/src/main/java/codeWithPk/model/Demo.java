package codeWithPk.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
	
	public static void main(String[] args) {
		
//		ApplicationContext ctx = AnnotationConfigApplicationContext()
	    ApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
	    PersonHGym pg = (PersonHGym)  ctx.getBean("personHGym",PersonHGym.class);
	    pg.printAppName();
//	    pg.printList();
	    pg.printMap();
		
	}

}
