package com.ram.model;

public class Employee
{
	private int id;
	private String name;
	private Address address;

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Address getAddress()
	{
		return address;
	}

	public void setAddress(Address address)
	{
		this.address = address;
	}

	public void displayEmployeeDetails()
	{
		System.out.println("Employee [id=" + id + ", name=" + name
				+ ", address=" + address + "]");
	}

}
