package com.ram.contextaware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.ram.model.Employee;

public class ApplicationContextAwareImpl implements ApplicationContextAware
{

	private ApplicationContext applicationContext;

	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException
	{

		System.out.println(
				"setApplicationContext method called by the Spring Container");
		this.applicationContext = applicationContext;

	}

	public void displayEmployeeDetails()
	{
		Employee employee = applicationContext.getBean("employee",
				Employee.class);

		System.out.println(
				"Got employee object from the ApplicationContext(Spring Container) = "
						+ employee);

		System.out.println("is employee object Singleton? = "
				+ applicationContext.isSingleton("employee"));
	}

}
