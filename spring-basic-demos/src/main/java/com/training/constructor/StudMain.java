package com.training.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.training.setter.Employee;

public class StudMain {
	public static void main(String[] args) {
		
	
	ApplicationContext context=new AnnotationConfigApplicationContext("com.training");
	Student student =context.getBean(Student.class,"student");
	System.out.println(student);
	}
}