package com.ram.core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ram.factoryaware.BeanFactoryAwareImpl;

public class App
{
	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		BeanFactoryAwareImpl beanFactoryAwareImpl = applicationContext
				.getBean("beanFactoryAware", BeanFactoryAwareImpl.class);

		beanFactoryAwareImpl.displayEmployeeDetails();

		applicationContext.close();
	}
}

