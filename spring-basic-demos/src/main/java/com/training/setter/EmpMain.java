package com.training.setter;

import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmpMain {

	public static void main(String[] args) {
	ApplicationContext context=new AnnotationConfigApplicationContext("com.training");
	//Employee employee=(Employee)context.getBean("employee");
	
		//Employee employe1 =context.getBean(Employee.class,"employee");
		//System.out.println(employe1);
		
		Employee employe2 =context.getBean(Employee.class,"employee");
		System.out.println(employe2);
		
		
		//String[] beans=context.getBeanDefinitionNames();
		//for(String bean:beans) {
			//System.out.println(bean);
		//}
		//System.out.println("Another WAY");
		//Stream.of(context.getBeanDefinitionNames()).forEach(System.out::println);
		

	}

}