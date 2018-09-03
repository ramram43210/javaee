package com.ram.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("employee")
public class Employee
{
	@Value("100")
	private int id;

	@Value("Peter")
	private String name;

	@Value("#{address.getFullAddress()}")
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
