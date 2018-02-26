package com.ram.model;

public class Employee
{
	private int id;
	private String name;
	private Address address;

	public Employee(int id, String name, Address address)
	{
		this.id = id;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString()
	{
		return "Employee [id=" + id + ", name=" + name + ", address=" + address
				+ "]";
	}

}
