package com.ram.model;

public class Employee
{
	private int id;

	private String name;

	private Address address;

	private String employeeState;

	private String fullAddress;

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

	public Address getAddress()
	{
		return address;
	}

	public void setAddress(Address address)
	{
		this.address = address;
	}

	public String getEmployeeState()
	{
		return employeeState;
	}

	public void setEmployeeState(String employeeState)
	{
		this.employeeState = employeeState;
	}

	public String getFullAddress()
	{
		return fullAddress;
	}

	public void setFullAddress(String fullAddress)
	{
		this.fullAddress = fullAddress;
	}

	@Override
	public String toString()
	{
		return "Employee [id=" + id + ", name=" + name + ", employeeState="
				+ employeeState + ", fullAddress=" + fullAddress + ", address="
				+ address + "]";
	}

}
