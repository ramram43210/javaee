package com.ram.model;

public class Employee
{
	private int id;
	private String name;
	private String countryName;

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

	public String getCountryName()
	{
		return countryName;
	}

	public void setCountryName(String countryName)
	{
		this.countryName = countryName;
	}

	@Override
	public String toString()
	{
		return "Employee [id=" + id + ", name=" + name + ", countryName="
				+ countryName + "]";
	}

}
