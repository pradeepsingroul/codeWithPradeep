package MyReferenceType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class application {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("referencesContext.xml");
		A a = (A) ctx.getBean("a1");
		System.out.println(a);
		a.getB().printt();
	}

}
