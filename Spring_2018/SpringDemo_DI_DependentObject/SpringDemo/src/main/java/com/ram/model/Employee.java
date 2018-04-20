package com.ram.model;

public class Employee
{
	private int id;
	private String name;
	private Address address;

	public Employee(int id, String name, Address address)
	{
		System.out.println("Employee(int id, String name, Address address) "
				+ "constructor is called by the Spring container");
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public void displayEmployeeDetails()
	{
		System.out.println("Employee [id=" + id + ", name=" + name
				+ ", address=" + address + "]");
	}

}
