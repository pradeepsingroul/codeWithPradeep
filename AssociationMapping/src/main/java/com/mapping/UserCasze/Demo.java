package com.mapping.UserCasze;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.swing.text.Utilities;

import com.mapping.Model.Department;
import com.mapping.Model.Employee;
import com.mapping.Utility.Utility;

public class Demo {
	
	public static void main(String[] args) {
		
		EntityManager em  = Utility.provideEntityManager();
		
		em.getTransaction().begin();
		
		Department dept1 = new Department(1, "Software developement", "Banglore");
		
		Employee emp1 = new Employee(10, "Pradeep", "Satna mp");
		
		dept1.setEmployee(emp1);
		em.persist(emp1);
		em.persist(dept1);
		
		em.getTransaction().commit();
		
		em.close();
		System.out.println("Done....");
		
	}

}
