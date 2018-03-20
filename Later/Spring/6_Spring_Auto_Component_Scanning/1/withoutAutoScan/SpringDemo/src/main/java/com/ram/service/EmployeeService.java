package com.ram.service;

import com.ram.dao.EmployeeDAO;

public class EmployeeService
{
	EmployeeDAO employeeDAO;

	public void setEmployeeDAO(EmployeeDAO employeeDAO)
	{
		this.employeeDAO = employeeDAO;
	}

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
