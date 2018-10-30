package com.ram.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ram.service.CustomerService;
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

		employeeService.getEmployeeName();

		System.out.println("----------------------------------------");

		employeeService.getEmployeeAge();

		System.out.println("----------------------------------------");

		employeeService.getEmployeeAddress();
		
		
		CustomerService customerService = context
				.getBean("customerService", CustomerService.class);
		
		System.out.println("----------------------------------------");
		
		customerService.getCustomerName();

		System.out.println("----------------------------------------");

		customerService.getCustomerAge();

		System.out.println("----------------------------------------");

		customerService.getCustomerAddress();
	}

}
