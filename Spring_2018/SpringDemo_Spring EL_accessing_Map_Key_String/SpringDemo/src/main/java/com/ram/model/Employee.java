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

	@Value("#{addressInfo.addressMap['West']}")
	private String westAddress;

	@Value("#{addressInfo.addressMap['North']}")
	private String northAddress;

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

	public String getWestAddress()
	{
		return westAddress;
	}

	public void setWestAddress(String westAddress)
	{
		this.westAddress = westAddress;
	}

	public String getNorthAddress()
	{
		return northAddress;
	}

	public void setNorthAddress(String northAddress)
	{
		this.northAddress = northAddress;
	}

	@Override
	public String toString()
	{
		return "Employee [id=" + id + ", name=" + name + ", westAddress="
				+ westAddress + ", northAddress=" + northAddress + "]";
	}

}
