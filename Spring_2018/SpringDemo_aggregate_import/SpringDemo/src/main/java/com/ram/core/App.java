package com.ram.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ram.config.AppConfig;

public class App
{
	public static void main(String[] args)
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(
				AppConfig.class);

		System.out.println("---------------------------------------");
		
		Employee employee = (Employee) context.getBean("employee");
		System.out.println("Got employee object from the ApplicationContext");
		employee.employeeDetails();
		
		System.out.println("---------------------------------------");
		
		Customer customer = (Customer) context.getBean("customer");
		System.out.println("Got customer object from the ApplicationContext");
		customer.customerDetails();

	}
}
