package ManyToOne.Utility;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class Utility {
	
	public static EntityManager proviceEnityManager() {
		
		EntityManager em = Persistence.createEntityManagerFactory("mapping").createEntityManager();
		
		return em;
		
	}

}
