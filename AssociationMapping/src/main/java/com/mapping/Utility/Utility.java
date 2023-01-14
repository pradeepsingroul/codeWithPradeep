package com.mapping.Utility;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class Utility {
	
	
	public static EntityManager provideEntityManager() {
		EntityManager em = Persistence.createEntityManagerFactory("mapping").createEntityManager();
		
		return em;
	}

}
