package com.ram.core;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ram.core.dao.EmployeeDAO;
import com.ram.core.dao.impl.EmployeeDAOImpl;
import com.ram.core.model.Employee;

public class App
{

	public static void main(String[] args) throws IOException
	{
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		EmployeeDAO employeeDao = (EmployeeDAO) context
				.getBean("employeeDAO");

		Employee employee1 = new Employee();
		employee1.setFirstName("Peter");
		employee1.setLastName("david");
		employee1.setAge(50);
		employee1.setSalary(90000);

		employeeDao.save(employee1);

		Employee employee2 = new Employee();
		employee2.setFirstName("Peter");
		employee2.setLastName("david");
		employee2.setAge(50);
		employee2.setSalary(90000);

		employeeDao.save(employee2);

		Employee employee3 = employeeDao.get(2);
		System.out.println(employee3);
	}

}