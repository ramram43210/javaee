package com.ram.service;

public class EmployeeService
{
	public String addEmployee(String name)
	{
		System.out
				.println("addEmployee(String name) method is called");
		return "Employee Peter information is added successfully";
	}

	public void modifyEmployee()
	{
		System.out.println("modifyEmployee() is called");
	}

	public void deleteEmployee()
	{
		System.out.println("deleteEmployee() method is called");
	}

}
