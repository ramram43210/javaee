package com.ram.model;

public class Employee
{
	private int id;

	private String name;

	private String fullAddress;

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

	public String getFullAddress()
	{
		return fullAddress;
	}

	public void setFullAddress(String fullAddress)
	{
		this.fullAddress = fullAddress;
	}

	@Override
	public String toString()
	{
		return "Employee [id=" + id + ", name=" + name + ", fullAddress="
				+ fullAddress + "]";
	}

}
