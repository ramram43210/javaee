package com.ram.core;

/**
 * Spring bean
 *
 */
public class Employee
{
	private String name;
	
	public void setName(String name)
	{
		System.out.println(this.getClass().getName()
				+ ", setName(String name) method is called " + name);
		this.name = name;
	}

	public void employeeDetails()
	{
		System.out.println("Employee Name =  "+name);
	}
}
