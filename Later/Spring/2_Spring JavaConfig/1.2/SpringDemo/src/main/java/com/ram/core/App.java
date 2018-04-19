package com.ram.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ram.config.ApplicationBeans;
import com.ram.model.Employee;

public class App
{
	public static void main(String[] args)
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(
				ApplicationBeans.class);

		System.out.println("---------------------------------------");

		Employee employee = (Employee) context.getBean("employee");
		System.out.println(
				"Got employee object from the ApplicationContext(Spring Container)");
		System.out.println(employee);

	}

}
