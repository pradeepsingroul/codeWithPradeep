package com.masai;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Demo {
	
	public static void main(String[] args) {
 
		EntityManager em = Persistence.createEntityManagerFactory("studentUnit").createEntityManager();

		
		Student merging = new Student(45, "Mahesh", 600);
		
		em.getTransaction().begin();
		
//		for select
		Student s = em.find(Student.class, 14);
		System.out.println(s);

//		for insert
		em.persist(s);
		
//		for update marks
		s.setMarks(s.getMarks()+44);
		
		/*or*/
		
		em.merge(merging);
		
//		for delete
		em.remove(s);
		
		
		em.getTransaction().commit();
		em.close();


//		
		System.out.println("Done...");
		
		
	}

}
