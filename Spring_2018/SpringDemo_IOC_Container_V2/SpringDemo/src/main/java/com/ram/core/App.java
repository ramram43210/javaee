package com.ram.core;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.ram.model.Employee;

public class App
{
	public static void main(String[] args)
	{
		usingBeanFactory();
		usingApplicationContext();

	}

	private static void usingBeanFactory()
	{
		System.out.println("************* Using BeanFactory ************* ");
		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);

		System.out.println("---------------------------------------");

		Employee employee = (Employee) factory.getBean("employee");
		System.out.println(
				"Got employee object from the BeanFactory(Spring Container)");
		employee.employeeDetails();
	}

	private static void usingApplicationContext()
	{
		System.out.println("\n************* Using ApplicationContext ******* ");
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		System.out.println("---------------------------------------");

		Employee employee = (Employee) context.getBean("employee");
		System.out.println(
				"Got employee object from the ApplicationContext(Spring Container)");
		employee.employeeDetails();
	}
}
