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

	@Value("#{address.state == 'TamilNadu' ? true : false}")
	private boolean southIndian;

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

	public boolean isSouthIndian()
	{
		return southIndian;
	}

	public void setSouthIndian(boolean southIndian)
	{
		this.southIndian = southIndian;
	}

	@Override
	public String toString()
	{
		return "Employee [id=" + id + ", name=" + name + ", southIndian="
				+ southIndian + "]";
	}

}
