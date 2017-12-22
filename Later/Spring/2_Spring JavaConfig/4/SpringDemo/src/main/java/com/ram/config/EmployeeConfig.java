package com.ram.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ram.core.Employee;

@Configuration
public class EmployeeConfig
{

	@Bean(name = "employee")
	public Employee employee()
	{

		System.out.println(
				"In EmployeeConfig employee() is called by the Spring container");
		return new Employee("Peter");

	}
}