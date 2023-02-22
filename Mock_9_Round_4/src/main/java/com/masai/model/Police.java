package com.masai.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Police {
	
	@Id
	private Integer policeId;
	
	private String officerNAme;
	
	private String mobileNumber;
	
	private String department;
	
	@OneToMany
	private List<FIR> firstfiilled;
	
	@OneToMany
	private List<FIR> casesClosed;

		
	

	public void setPoliceId(Integer policeId) {
		this.policeId = policeId;
	}

	public String getOfficerNAme() {
		return officerNAme;
	}

	public void setOfficerNAme(String officerNAme) {
		this.officerNAme = officerNAme;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public List<FIR> getFirstfiilled() {
		return firstfiilled;
	}

	public void setFirstfiilled(List<FIR> firstfiilled) {
		this.firstfiilled = firstfiilled;
	}

	public List<FIR> getCasesClosed() {
		return casesClosed;
	}

	public void setCasesClosed(List<FIR> casesClosed) {
		this.casesClosed = casesClosed;
	}

	@Override
	public String toString() {
		return "Police [policeId=" + policeId + ", officerNAme=" + officerNAme + ", mobileNumber=" + mobileNumber
				+ ", department=" + department + ", firstfiilled=" + firstfiilled + ", casesClosed=" + casesClosed
				+ "]";
	}

	public Police(Integer policeId, String officerNAme, String mobileNumber, String department, List<FIR> firstfiilled,
			List<FIR> casesClosed) {
		super();
		this.policeId = policeId;
		this.officerNAme = officerNAme;
		this.mobileNumber = mobileNumber;
		this.department = department;
		this.firstfiilled = firstfiilled;
		this.casesClosed = casesClosed;
	}

	public Police() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
