package com.ram.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee
{
	private String name;
	@Autowired
	private Address address;

	public Employee(String name)
	{
		System.out.println("Employee(String name) constructor "
				+ "is called by the Spring container");
		this.name = name;
	}

	public void displayEmployeeDetails()
	{
		System.out.println(
				"Employee [name=" + name + ", address=" + address + "]");
	}

}
