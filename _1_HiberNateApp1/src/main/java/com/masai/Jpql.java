package com.masai;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Jpql {
	public static void main(String[] args) {
		
		
		EntityManager em = Persistence.createEntityManagerFactory("studentUnit").createEntityManager();
		
		String query  = "SELECT s from Student s";
		String query1  = "SELECT s from Student s where s.name = 'pradeep'";
		String query2  = "SELECT s from Student s where s.name LIKE 'P%'";
		String query3  = "SELECT s from Student s where s.roll = 45";
		String query4  = "SELECT s.name from Student s where s.roll = 45";
		
		
		
		Query q = em.createQuery(query4);
		List<String> lst = q.getResultList();
		lst.forEach(s-> System.out.println(s));
		
		
	}

}
