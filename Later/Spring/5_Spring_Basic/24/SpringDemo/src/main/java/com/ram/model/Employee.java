package com.ram.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Employee
{
	private int id;
	private String name;

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

	@PostConstruct
	public void init() throws Exception
	{
		System.out.println("inside Init method after properties are set. ");
	}
	
	@PreDestroy
	public void cleanUp() throws Exception
	{
		System.out.println("Inside cleanUp(), Performed clean up tasks.");
	}

	@Override
	public String toString()
	{
		return "Employee [id=" + id + ", name=" + name + "]";
	}

}
