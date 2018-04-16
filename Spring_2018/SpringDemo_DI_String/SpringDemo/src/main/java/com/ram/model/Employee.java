package com.ram.model;

public class Employee
{
	private int id;
	private String name;

	public Employee(int id)
	{
		System.out.println("Employee(int id) constructor is called "
				+ "by the Spring container");
		this.id = id;
	}

	public Employee(String name)
	{
		System.out.println("Employee(String name) constructor is called "
				+ "by the Spring container");
		this.name = name;
	}

	public Employee(int id, String name)
	{
		System.out.println("Employee(int id, String name) constructor "
				+ "is called by the Spring container");
		this.id = id;
		this.name = name;
	}

	public void displayEmployeeDetails()
	{
		System.out.println("Employee [id=" + id + ", name=" + name + "]");
	}

}
