package com.mapping.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Columns;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Department {
	
	@Id
	private int deptId;
	
	private String department;
	
	private String office;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinTable(name = "Dept_Empl")
	private Employee employee;

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", department=" + department + ", office=" + office + ", employee="
				+ employee + "]";
	}

	public Department(int deptId, String department, String office) {
		super();
		this.deptId = deptId;
		this.department = department;
		this.office = office;
		
	}

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
