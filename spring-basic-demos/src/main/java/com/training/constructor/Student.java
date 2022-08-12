package com.training.constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Student {
	
	private String name;
	private Course course;
	public String getName() {
		return name;
	}
	@Value("Jo")
	public void setName(String name) {
		this.name = name;
	}
	public Course getCourse() {
		return course;
	}
	@Autowired
	public void setCourse(Course course) {
		this.course = course;
	}
	
	
	
	



}
