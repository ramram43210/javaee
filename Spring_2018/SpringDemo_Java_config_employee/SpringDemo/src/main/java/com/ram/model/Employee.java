package com.ram.model;

public class Employee
{
	private int id;
	private String name;

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
