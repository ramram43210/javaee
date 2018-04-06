package com.ram.core;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ram.model.Employee;

public class App
{
	public static void main(String[] args)
	{
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		context.start();
		System.out.println("---------------------------------------");

		Employee employee = (Employee) context.getBean("employee");
		System.out.println(
				"Got employee object from the ApplicationContext(Spring Container)");
		employee.employeeDetails();
		
		context.refresh();

		System.out.println("---------------------------------------");
		context.close();
	}

}
