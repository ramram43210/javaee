package com.ram.employee.dao.impl;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.ram.employee.dao.EmploeyeeDAO;

public class EmployeeDAOImpl
		extends JdbcDaoSupport implements EmploeyeeDAO
{

	public void updateEmployeeNameBasedOnAge(String name, int age)
	{
		String sql = "update Employee set Name=? where AGE=?";
		getJdbcTemplate().update(sql, name, age);
	}

}
