package com.ram.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ram.employee.dao.EmploeyeeDAO;
import com.ram.employee.model.Employee;

public class App
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		EmploeyeeDAO employeeDAO = (EmploeyeeDAO) context
				.getBean("employeeDAO");
		String name = employeeDAO.getEmployee(1);
		System.out.println(name);
	}
}
