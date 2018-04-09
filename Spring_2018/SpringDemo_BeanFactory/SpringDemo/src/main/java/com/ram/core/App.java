package com.ram.core;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class App
{
	public static void main(String[] args)
	{
		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);

		System.out.println("---------------------------------------");

		// 1 st way of getting employee bean
		Object object = factory.getBean("employee");
		Employee employee = (Employee) object;
		System.out.println(
				"Got employee object from the BeanFactory(Spring Container)");
		employee.employeeDetails();

		// 2nd way of getting employee bean
		employee = factory.getBean("employee", Employee.class);
		System.out.println(
				"\nGot employee object from the BeanFactory(Spring Container)");
		employee.employeeDetails();

		// 3rd way of getting employee bean
		employee = factory.getBean(Employee.class);
		System.out.println(
				"\nGot employee object from the BeanFactory(Spring Container)");
		employee.employeeDetails();

		boolean result = factory.containsBean("employee");
		System.out.println("\nis employee bean available? = " + result);

		boolean isSingleton = factory.isSingleton("employee");
		System.out.println(
				"\nis employee bean Singleton[always return the same instance]? = "
						+ isSingleton);

		boolean isPrototype = factory.isPrototype("employee");
		System.out.println(
				"\nis employee bean isPrototype[always return independent instances]? = "
						+ isPrototype);

	}

}
