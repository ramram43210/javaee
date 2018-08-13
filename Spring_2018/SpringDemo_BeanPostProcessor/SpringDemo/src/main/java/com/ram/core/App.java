package com.ram.core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ram.model.Employee;
import com.ram.model.Fruit;

public class App
{
	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		System.out.println("---------------------------------------");

		Employee employee = context.getBean("employee", Employee.class);
		System.out.println(
				"Got employee object from the ApplicationContext(Spring Container) = "
						+ employee);

		Fruit fruit = context.getBean("fruit", Fruit.class);
		System.out.println(
				"Got fruit object from the ApplicationContext(Spring Container) = "
						+ fruit);
		
		context.registerShutdownHook();
	}

}
