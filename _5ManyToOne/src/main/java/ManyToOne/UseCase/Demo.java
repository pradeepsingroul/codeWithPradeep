package ManyToOne.UseCase;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import ManyToOne.Model.Department;
import ManyToOne.Model.Employee;
import ManyToOne.Utility.Utility;



public class Demo {
	
	public static void main(String[] args) {
		
EntityManager em = Utility.proviceEnityManager();
		
		em.getTransaction().begin();
		
		Department d1 = new Department();
		
		d1.setDeptId(10);
		d1.setDepartment("Developer");
		d1.setOffice("Pune");
		
		List<Employee> lst  = new ArrayList();
		Employee e1 = new Employee(10, "Om kundu", "allahabad up");
		e1.setDepartment(d1);
		Employee e2 =  new Employee(11, "manu", "chatarpur mp");
		e2.setDepartment(d1);
		Employee e3 =  new Employee(12, "kundu", "teekamgar mp");
		e3.setDepartment(d1);
		Employee e4 =  new Employee(13, "kunal", "Panna mp");
		e4.setDepartment(d1);
	
		em.persist(d1);
	    em.persist(e4);
	    em.persist(e3);
	    em.persist(e2);
	    em.persist(e1);
	
		
		em.getTransaction().commit();
		
		em.close();
		
		System.out.println("Done....");
		
	}

}
