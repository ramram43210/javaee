package com.ram.model;

public class Employee
{
	private int id;
	private String name;
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
