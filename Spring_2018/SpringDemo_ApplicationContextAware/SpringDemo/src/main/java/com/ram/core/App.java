package com.ram.core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ram.contextaware.ApplicationContextAwareImpl;

public class App
{
	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		ApplicationContextAwareImpl applicationContextAwareImpl = applicationContext
				.getBean("applicationContextAware",
						ApplicationContextAwareImpl.class);

		applicationContextAwareImpl.displayEmployeeDetails();

		applicationContext.close();
	}

}
