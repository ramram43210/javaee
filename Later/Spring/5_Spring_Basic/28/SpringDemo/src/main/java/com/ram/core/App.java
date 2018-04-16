package com.ram.core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ram.factoryaware.BeanFactoryAwareImpl;

public class App
{
	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		BeanFactoryAwareImpl BeanFactoryAwareImplsdfdf = applicationContext
				.getBean("beanFactoryAware", BeanFactoryAwareImpl.class);

		applicationContextAwareImpl.displayEmployeeDetails();

		applicationContext.close();
	}
}

