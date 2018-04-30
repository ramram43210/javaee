package com.ram.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ram.model.Employee;
import com.ram.model.AddressInfo;

public class App
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		System.out.println("---------------------------------------");

		AddressInfo addressInfo = (AddressInfo) context
				.getBean("addressInfo");
		System.out.println(addressInfo+"\n");

		Employee employee = (Employee) context.getBean("employee");
		System.out.println(employee);
	}

}
