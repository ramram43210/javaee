package com.ram.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ram.model.Employee;

public class App
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		System.out.println("---------------------------------------");

		// 1 st way of getting employee bean
		Object object = context.getBean("employee");
		Employee employee = (Employee) object;
		System.out.println(
				"Got employee object from the ApplicationContext(Spring Container)");
		employee.employeeDetails();

		// 2nd way of getting employee bean
		employee = context.getBean("employee", Employee.class);
		System.out.println(
				"\nGot employee object from the ApplicationContext(Spring Container)");
		employee.employeeDetails();

		// 3rd way of getting employee bean
		employee = context.getBean(Employee.class);
		System.out.println(
				"\nGot employee object from the ApplicationContext(Spring Container)");
		employee.employeeDetails();

		boolean result = context.containsBean("employee");
		System.out.println("\nis employee bean available? = " + result);

		boolean isSingleton = context.isSingleton("employee");
		System.out.println(
				"\nis employee bean Singleton[always return the same instance]? = "
						+ isSingleton);

		boolean isPrototype = context.isPrototype("employee");
		System.out.println(
				"\nis employee bean isPrototype[always return independent instances]? = "
						+ isPrototype);

		String displayName = context.getDisplayName();
		System.out.println("\ndisplayName = " + displayName);

	}

}
