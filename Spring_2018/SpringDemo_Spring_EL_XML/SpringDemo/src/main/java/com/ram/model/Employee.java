package com.ram.model;

public class Employee
{
	private int id;
	private String name;
	private String employeeState;
	private Address address;

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

	public String getEmployeeState()
	{
		return employeeState;
	}

	public void setEmployeeState(String employeeState)
	{
		this.employeeState = employeeState;
	}

	public Address getAddress()
	{
		return address;
	}

	public void setAddress(Address address)
	{
		this.address = address;
	}

	@Override
	public String toString()
	{
		return "Employee [id=" + id + ", name=" + name + ", employeeState="
				+ employeeState + ", address=" + address + "]";
	}

}
