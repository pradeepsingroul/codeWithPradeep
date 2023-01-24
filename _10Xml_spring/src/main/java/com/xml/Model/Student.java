package com.xml.Model;

public class Student {
	
	private int stId;
	private String sName;
	private String address;
	private int marks;
	private int totalMarks;
	
	private Department d1;
	
	
	
	
    public Department getD1() {
		return d1;
	}

	public void setD1(Department d1) {
		this.d1 = d1;
	}

	//	Init method
	public void preMethod() {
		System.out.println("Pre methods.......");
	}
	
//	destroy method
	public void postMethod() {
		System.out.println("post methods.......");
	}
	
	public String calculatePercentage() {
		double d = marks*100/totalMarks;
		return d+"%";
	}


	public int getStId() {
		return stId;
	}


	public void setStId(int stId) {
		this.stId = stId;
	}


	public String getsName() {
		return sName;
	}


	public void setsName(String sName) {
		this.sName = sName;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}


	public int getTotalMarks() {
		return totalMarks;
	}


	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}


	@Override
	public String toString() {
		return "Student [stId=" + stId + ", sName=" + sName + ", address=" + address + ", marks=" + marks
				+ ", totalMarks=" + totalMarks + ", d1=" + d1 + "]";
	}


	public Student(int stId, String sName, String address, int marks, int totalMarks) {
		super();
		this.stId = stId;
		this.sName = sName;
		this.address = address;
		this.marks = marks;
		this.totalMarks = totalMarks;
	}


	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}