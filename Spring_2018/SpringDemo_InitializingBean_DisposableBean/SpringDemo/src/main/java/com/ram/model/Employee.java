package com.ram.model;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean, DisposableBean
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

	public void afterPropertiesSet() throws Exception
	{
		System.out.println("inside afterPropertiesSet().  ");
	}

	public void destroy() throws Exception
	{
		System.out.println("Inside destroy(), Performed clean up tasks.");
	}

	@Override
	public String toString()
	{
		return "Employee [id=" + id + ", name=" + name + "]";
	}

}
