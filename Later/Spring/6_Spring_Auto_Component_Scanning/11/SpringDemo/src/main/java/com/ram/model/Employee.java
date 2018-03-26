package com.ram.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee
{
	private String name;
	
	@Autowired
	@Qualifier("bangaloreAddress")
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
