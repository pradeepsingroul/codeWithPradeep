package MyCollections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Teacher {
	
	private int teacherId;
	private String teacherName;
	private List<String> phone;
	private Set<String> address;
	private Map<String,String>courses;
	public int getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public List<String> getPhone() {
		return phone;
	}
	public void setPhone(List<String> phone) {
		this.phone = phone;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	public Teacher(int teacherId, String teacherName, List<String> phone, Set<String> address,
			Map<String, String> courses) {
		super();
		this.teacherId = teacherId;
		this.teacherName = teacherName;
		this.phone = phone;
		this.address = address;
		this.courses = courses;
	}
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", teacherName=" + teacherName + ", phone=" + phone + ", address="
				+ address + ", courses=" + courses + "]";
	}
	
	

}
