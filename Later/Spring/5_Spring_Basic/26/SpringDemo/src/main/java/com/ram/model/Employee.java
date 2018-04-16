package com.ram.model;

/**
 * Spring bean
 */
public class Employee
{
	private String name;

	public void setName(String name)
	{
		this.name = name;
	}

	@Override
	public String toString()
	{
		return "Employee [name=" + name + "]";
	}
}
