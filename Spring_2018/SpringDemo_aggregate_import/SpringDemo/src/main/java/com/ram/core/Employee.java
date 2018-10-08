package com.ram.core;

/**
 * Spring bean
 *
 */
public class Employee
{
	private String name;

	public Employee(String name)
	{
		System.out.println(this.getClass().getName()
				+ ", Employee(String name) constructor is called, " + name);

		this.name = name;
	}


	public void employeeDetails()
	{
		System.out.println("Employee Name =  " + name);
	}
}
