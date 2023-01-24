package _6Jpql.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department {
	
	
	@Id
	private int deptId;
	private String dName;
	private String office;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Employee> employees;
	
	
	
	
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", dName=" + dName + ", office=" + office + ", employees=" + employees
				+ "]";
	}
	public Department(int deptId, String dName, String office) {
		super();
		this.deptId = deptId;
		this.dName = dName;
		this.office = office;
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
