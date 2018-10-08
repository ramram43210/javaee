package com.ram.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ram.core.Customer;

@Configuration
public class CustomerConfig
{

	@Bean(name = "customer")
	public Customer customer()
	{
		System.out.println(
				"In CustomerConfig employee() is called by the Spring container");
		return new Customer("John");
	}

}