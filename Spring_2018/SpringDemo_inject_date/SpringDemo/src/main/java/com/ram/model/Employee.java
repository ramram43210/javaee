package com.ram.model;

import java.util.Date;

public class Employee
{
	private String name;
	private Date dateOfBirth;

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Date getDateOfBirth()
	{
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth)
	{
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString()
	{
		return "Employee [name=" + name + ", dateOfBirth=" + dateOfBirth + "]";
	}

}
