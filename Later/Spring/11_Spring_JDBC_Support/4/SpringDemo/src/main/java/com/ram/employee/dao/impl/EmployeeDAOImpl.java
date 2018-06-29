package com.ram.employee.dao.impl;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.ram.employee.dao.EmploeyeeDAO;
import com.ram.employee.model.Employee;

public class EmployeeDAOImpl
		extends JdbcDaoSupport implements EmploeyeeDAO
{

	public void insert(Employee employee)
	{

		String sql = "INSERT INTO EMPLOYEE "
				+ "(EMPLOYEE_ID, NAME, AGE,SALARY) VALUES (?, ?, ?,?)";

		getJdbcTemplate().update(sql,
				new Object[] { employee.getEmployeeId(),
						employee.getName(), employee.getAge(),
						employee.getSalary() });

	}
}
