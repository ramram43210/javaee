package com.ram.model;

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

	public Employee(String name, Address address)
	{
		System.out.println("Employee(String name, Address address) "
				+ "constructor is called by the Spring container");
		this.name = name;
		this.address = address;
	}

	public void displayEmployeeDetails()
	{
		System.out.println(
				"Employee [name=" + name + ", address=" + address + "]");
	}

}
