package _6Jpql.Utility;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class Utility {
	
	public static EntityManager providEntityManager() {
		EntityManager em = Persistence.createEntityManagerFactory("jpql").createEntityManager();
		return em;
	}

}
