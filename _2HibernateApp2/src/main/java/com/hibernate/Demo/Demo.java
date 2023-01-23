package com.hibernate.Demo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import com.hibernate.Model.Address;
import com.hibernate.Model.Student;
import com.hibernate.Utility.Utility;

public class Demo {
	
	public static void main(String[] args) {
		
		EntityManager em = Utility.provideEntityManager();
		
		em.getTransaction().begin();
		
		Student s = new Student();
		s.setRoll(340);
		s.setMarks(650);
		s.setStudentName("parth mishra");
		List<Address> lst = new ArrayList();
		lst.add(new Address("MH", "Pune", "500001","Home"));
		lst.add(new Address("HP", "Baddi", "785101","Office"));
		s.setLstAddress(lst);
		
		em.persist(s);
		
		em.getTransaction().commit();
		
		em.close();
		
		System.out.println("Done.............");
		
		

		
		
		
	}

}
