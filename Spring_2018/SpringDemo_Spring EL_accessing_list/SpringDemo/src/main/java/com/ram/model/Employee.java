package com.ram.model;

public class Employee
{
	private int id;
	private String name;
	private String firstAddress;
	private String secondAddress;

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

	public String getFirstAddress()
	{
		return firstAddress;
	}

	public void setFirstAddress(String firstAddress)
	{
		this.firstAddress = firstAddress;
	}

	public String getSecondAddress()
	{
		return secondAddress;
	}

	public void setSecondAddress(String secondAddress)
	{
		this.secondAddress = secondAddress;
	}

	@Override
	public String toString()
	{
		return "Employee [id=" + id + ", name=" + name + ", firstAddress="
				+ firstAddress + ", secondAddress=" + secondAddress + "]";
	}

}
