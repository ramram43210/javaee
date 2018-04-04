package com.ram.model;

/**
 * Spring bean
 *
 */
public class Employee
{
	private String name;

	public void setName(String name)
	{
		this.name = name;
	}

	public void employeeDetails()
	{
		System.out.println("Employee Name =  " + name);
	}
}
