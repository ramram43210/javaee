package com.ram.model;

import javax.annotation.Resource;

public class Employee
{
	private String name;
	private Address address;

	public Employee(String name)
	{
		System.out.println("Employee(String name) constructor "
				+ "is called by the Spring container");
		this.name = name;
	}

	@Resource
	public void setAddress(Address address)
	{
		this.address = address;
	}

	public void displayEmployeeDetails()
	{
		System.out.println(
				"Employee [name=" + name + ", address=" + address + "]");
	}

}
