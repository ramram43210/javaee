package com.ram.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ram.service.EmployeeService;

public class App
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		System.out.println("---------------------------------------");

		EmployeeService employeeService = context
				.getBean("employeeService", EmployeeService.class);

		employeeService.addEmployee();

		employeeService.modifyEmployee();

		employeeService.deleteEmployee();

	}

}
