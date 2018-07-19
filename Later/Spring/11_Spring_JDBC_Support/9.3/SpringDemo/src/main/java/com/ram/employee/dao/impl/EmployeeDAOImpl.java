package com.ram.employee.dao.impl;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.ram.employee.dao.EmploeyeeDAO;

public class EmployeeDAOImpl
		extends JdbcDaoSupport implements EmploeyeeDAO
{

	public void deleteByEmployeeId(String name, int age)
	{
		String sql = "DELETE FROM EMPLOYEE WHERE Name=? and AGE=?";
		getJdbcTemplate().update(sql, new Object[] { name, age });
	}

}
