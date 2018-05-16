package com.ram.service;

public class EmployeeService
{
	public String getEmployeeName(int age)
	{
		System.out.println("Get Employee Information");
		if(age != 28)
		{
			 throw new ArithmeticException("Not a valid age"); 
		}
		return "Dave";
	}
}
