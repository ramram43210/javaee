package com.ram.core.model;

public class Employee
{
	private String name;
	private String address;
	private int age;

	public Employee(String name, String address, int age)
	{
		this.name = name;
		this.address = address;
		this.age = age;
	}

	public Employee(String name, int age, String address)
	{
		this.name = name;
		this.age = age;
		this.address = address;
	}

	@Override
	public String toString()
	{
		return "Employee [name=" + name + ", address=" + address + ", age="
				+ age + "]";
	}

}
