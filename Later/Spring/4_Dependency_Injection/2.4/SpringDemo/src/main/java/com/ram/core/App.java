package com.ram.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
	public static void main(String[] args)
	{
		/*
		 * Create a new ClassPathXmlApplicationContext, loading the
		 * definitions from the given XML file and automatically
		 * refreshing the context.
		 * 
		 * Parameters:
		 * 
		 * configLocation - resource location
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		System.out.println("---------------------------------------");

		Employee employee = context.getBean("employee", Employee.class);
		System.out.println(
				"Got employee object from the ApplicationContext(Spring Container)");
		employee.employeeDetails();

	}

}
