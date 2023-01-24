package com.pureAnnotaion.Model;

import java.time.LocalTime;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
public class Course {
	
	private String courseName;
	private String teacher;
	private LocalTime lct;
	
	
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	public LocalTime getLct() {
		return lct;
	}
	public void setLct(LocalTime lct) {
		this.lct = lct;
	}
	@Override
	public String toString() {
		return "Course [courseName=" + courseName + ", teacher=" + teacher + ", lct=" + lct + "]";
	}
	public Course(String courseName, String teacher, LocalTime lct) {
		super();
		this.courseName = courseName;
		this.teacher = teacher;
		this.lct = lct;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
