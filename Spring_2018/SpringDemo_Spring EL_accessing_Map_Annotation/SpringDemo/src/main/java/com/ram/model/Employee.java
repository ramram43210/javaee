package com.ram.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("employee")
public class Employee
{
	@Value("10")
	private int id;

	@Value("Peter")
	private String name;

	@Value("#{addressInfo.addressMap[1]}")
	private String firstAddress;

	@Value("#{addressInfo.addressMap[2]}")
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
