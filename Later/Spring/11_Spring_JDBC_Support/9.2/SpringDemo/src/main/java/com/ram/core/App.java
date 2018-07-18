package com.ram.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ram.employee.dao.EmploeyeeDAO;

public class App
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		EmploeyeeDAO employeeDAO = (EmploeyeeDAO) context
				.getBean("employeeDAO");
		employeeDAO.deleteByEmployeeId("Peter",30);
		System.out.println("employee row deleted successfully.");
	}
}
