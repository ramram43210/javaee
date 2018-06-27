package com.ram.employee.dao;

import com.ram.employee.model.Employee;

public interface EmploeyeeDAO 
{
	public void insert(Employee employee);
	public Employee findByEmployeeId(int employeeId);
}