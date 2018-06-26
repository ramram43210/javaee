package com.ram.customer.dao;

import com.ram.customer.model.Employee;

public interface EmploeyeeDAO 
{
	public void insert(Employee employee);
	public Employee findByEmployeeId(int employeeId);
}




