package com.hibernate.Utility;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class Utility {
	
	public static EntityManager provideEntityManager() {
		EntityManager em = Persistence.createEntityManagerFactory("studentUnit").createEntityManager();
		return em;
	}

}
