package MyCollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class application {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("CollectionContext.xml");

		Teacher t1 = (Teacher)ctx.getBean("t1");
		System.out.println(t1);
		
		
	}

}
