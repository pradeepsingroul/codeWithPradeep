package _6Jpql.UserCase;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import _6Jpql.Model.Department;
import _6Jpql.Model.Employee;
import _6Jpql.Utility.Utility;

public class Demo {
	
	public static void main(String[] args) {
		
		EntityManager em = Utility.providEntityManager();
		
//		em.getTransaction().begin();
		
		/*Department d = new Department(1, "Software Developement", "Bangluru");
		Department d1 = new Department(2, "Software Developement", "Hydrabad");
		
		
		Employee e1 = new Employee(101, "Pradeep Singroul", "Panna mp");
		Employee e2 = new Employee(100, "Raju Singroul", "satna mp");
		Employee e3 = new Employee(103, "Irfan khan", "Panna mp");
		Employee e4 = new Employee(102, "Pankaj sharma", "Panna mp");
		
		List<Employee> lst  = new ArrayList();
		lst.add(e4);
		lst.add(e3);
		List<Employee> lst1  = new ArrayList();
		lst1.add(e1);
		lst1.add(e2);
		
		d.setEmployees(lst1);
		d1.setEmployees(lst);
		em.persist(e4);
		em.persist(e3);
		em.persist(e2);
		em.persist(e1);
		em.persist(d);
		em.persist(d1);*/
		
		
//		String query = "from Department";
//		String query = "from Department d where d.dName = 'Software Developement'";
//		String query = "from Department d where d.deptId = 1";
		String query = "from Department d where d.dName LIKE '%Developement%'";
		Query q = em.createQuery(query);
		List<Department> lst = q.getResultList();
		lst.forEach(s -> System.out.println(s.getEmployees()));
		
		
//		em.getTransaction().commit();
		
		em.close();
		
		System.out.println("Donbe.....");
	
	}

}
