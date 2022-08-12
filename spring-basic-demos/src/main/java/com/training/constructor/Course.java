package com.training.constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Course {
	private String courseName;
	private double fees;
	
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	
	@Override
	public String toString() {
		return "Course [courseName=" + courseName + ", fees=" + fees + "]";
	}
	
	

}
