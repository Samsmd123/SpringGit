package com.training.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.training.constructor.Student;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext("com.training.app");
		DbConnection dbconnection =context.getBean(DbConnection.class,"dbConnection");
		System.out.println(dbconnection);

	}

}
