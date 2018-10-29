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
				.getBean("employeeServiceProxy", EmployeeService.class);

		employeeService.getEmployeeName();

		System.out.println("----------------------------------------");

		employeeService.getEmployeeAge();

		System.out.println("----------------------------------------");

		employeeService.getEmployeeAddress();
	}

}
