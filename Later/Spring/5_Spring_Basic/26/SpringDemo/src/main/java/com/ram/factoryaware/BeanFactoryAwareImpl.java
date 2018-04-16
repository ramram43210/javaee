package com.ram.factoryaware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

import com.ram.model.Employee;

public class BeanFactoryAwareImpl implements BeanFactoryAware
{

	private BeanFactory beanFactory;

	public void setBeanFactory(BeanFactory beanFactory) throws BeansException
	{
		System.out.println(
				"setBeanFactory method called by the Spring Container");
		this.beanFactory = beanFactory;

	}

	public void displayEmployeeDetails()
	{
		Employee employee = beanFactory.getBean("employee", Employee.class);

		System.out.println(
				"Got employee object from the ApplicationContext(Spring Container) = "
						+ employee);

		System.out.println("is employee object Singleton? = "
				+ beanFactory.isSingleton("employee"));
	}

}
