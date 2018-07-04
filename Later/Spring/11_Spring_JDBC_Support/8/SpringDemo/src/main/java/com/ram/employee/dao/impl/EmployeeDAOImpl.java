package com.ram.employee.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.ram.employee.dao.EmploeyeeDAO;
import com.ram.employee.model.Employee;

public class EmployeeDAOImpl
		extends JdbcDaoSupport implements EmploeyeeDAO
{

	public List<Employee> findAll()
	{
		String sql = "SELECT * FROM EMPLOYEE";

		List<Employee> employeeList = getJdbcTemplate().query(sql,
				new BeanPropertyRowMapper(Employee.class));
		
		return employeeList;
	}

}
