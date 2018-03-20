package com.ram.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ram.dao.EmployeeDAO;

@Component
public class EmployeeService
{
	@Autowired
	EmployeeDAO employeeDAO;

	public void addEmployee()
	{
		System.out.println("inside EmployeeService addEmployee()");
		employeeDAO.addEmployee();
	}

	@Override
	public String toString()
	{
		return "EmployeeService [employeeDAO=" + employeeDAO + "]";
	}

}
