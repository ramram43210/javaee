package com.ram.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ram.model.Employee;
import com.ram.model.Email;

public class App
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		System.out.println("---------------------------------------");

		Email email = (Email) context.getBean("email");
		System.out.println(email + "\n");

		Employee employee = (Employee) context.getBean("employee");
		System.out.println(employee);
	}

}
