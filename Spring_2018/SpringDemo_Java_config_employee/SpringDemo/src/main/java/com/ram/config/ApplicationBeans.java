package com.ram.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ram.model.Employee;

/**
 * Annotate with @Configuration to tell Spring that this is the core
 * Spring configuration file, and define bean via @Bean.
 */
@Configuration
public class ApplicationBeans
{

	@Bean(name = "employee")
	public Employee getEmployee()
	{
		return new Employee(36,"Peter");
	}

}