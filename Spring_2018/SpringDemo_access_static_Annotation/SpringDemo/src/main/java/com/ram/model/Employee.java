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
	
	@Value("#{T(com.ram.model.Address).STATE}")
	private String employeeState;
	
	@Value("#{T(com.ram.model.Address).getFullAddress()}")
	private String employeeFullAddress;

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

	public String getEmployeeFullAddress()
	{
		return employeeFullAddress;
	}

	public void setEmployeeFullAddress(String employeeFullAddress)
	{
		this.employeeFullAddress = employeeFullAddress;
	}

	@Override
	public String toString()
	{
		return "Employee [id=" + id + ", name=" + name + ", employeeState="
				+ employeeState + ", employeeFullAddress=" + employeeFullAddress
				+ "]";
	}

}
