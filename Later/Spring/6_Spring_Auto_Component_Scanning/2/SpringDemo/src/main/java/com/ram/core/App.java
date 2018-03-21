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

		EmployeeService employeeService = context.getBean("empSer",
				EmployeeService.class);
		System.out.println(
				"Got employeeService object from the ApplicationContext(Spring Container)");

		System.out.println(employeeService);

		employeeService.addEmployee();

	}

}
