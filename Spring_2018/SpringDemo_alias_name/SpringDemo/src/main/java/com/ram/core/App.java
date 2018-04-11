package com.ram.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ram.model.Employee;

public class App
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		System.out.println("---------------------------------------");

		Employee employee = (Employee) context.getBean("employeeAlias2");
		System.out.println(
				"Got employee object from the ApplicationContext(Spring Container)");
		employee.employeeDetails();

	}

}
