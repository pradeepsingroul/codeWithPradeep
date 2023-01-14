package OneToMany.UseCases;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import OneToMany.Model.Department;
import OneToMany.Model.Employee;
import OneToMany.Utility.Utility;

public class Demo {
	
	public static void main(String[] args) {
		
		EntityManager em = Utility.proviceEnityManager();
		
		em.getTransaction().begin();
		
		Department d1 = new Department();
		
		d1.setDeptId(10);
		d1.setDepartment("Developer");
		d1.setOffice("Pune");
		List<Employee> lst  = new ArrayList<>();
		lst.add(new Employee(10, "Om kundu", "allahabad up"));
		lst.add(new Employee(11, "manu", "chatarpur mp"));
		lst.add( new Employee(12, "kundu", "teekamgar mp"));
		lst.add(new Employee(13, "kunal", "Panna mp"));
	
	    d1.setEmployees(lst);
	    
		em.persist(d1);
		
		em.getTransaction().commit();
		
		em.close();
		
		System.out.println("Done....");
		
		
	}

}
