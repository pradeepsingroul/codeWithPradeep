package ManyToOne.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {
	
	
	@Id
	private int emplId;
	private String eName;
	private String homeCity;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Department department;
	
	
	public int getEmplId() {
		return emplId;
	}
	
	public Employee(int emplId, String eName, String homeCity, Department department) {
		super();
		this.emplId = emplId;
		this.eName = eName;
		this.homeCity = homeCity;
		this.department = department;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public void setEmplId(int emplId) {
		this.emplId = emplId;
	}
	
	public String geteName() {
		return eName;
	}
	
	public void seteName(String eName) {
		this.eName = eName;
	}
	
	public String getHomeCity() {
		return homeCity;
	}
	
	public void setHomeCity(String homeCity) {
		this.homeCity = homeCity;
	}
	
	@Override
	public String toString() {
		return "Employee [emplId=" + emplId + ", eName=" + eName + ", homeCity=" + homeCity + ", department="
				+ department + "]";
	}
	
	public Employee(int emplId, String eName, String homeCity) {
		super();
		this.emplId = emplId;
		this.eName = eName;
		this.homeCity = homeCity;
	}
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	

}
