package com.ram.core;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ram.model.Employee;

public class App
{
	public static void main(String[] args)
	{
		ConfigurableApplicationContext  context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		System.out.println("---------------------------------------");

		Employee employee = context.getBean("employee", Employee.class);
		System.out.println(
				"Got employee object from the ApplicationContext(Spring Container)");

		System.out.println(employee);

		context.close();
	}

}
