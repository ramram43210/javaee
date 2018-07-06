package com.ram.employee.dao.impl;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.ram.employee.dao.EmploeyeeDAO;

public class EmployeeDAOImpl
		extends JdbcDaoSupport implements EmploeyeeDAO
{

	public boolean isEmployeeExist(String name)
	{
		String sql = "SELECT COUNT(*) FROM EMPLOYEE where NAME=?";

		int count = getJdbcTemplate().queryForObject(sql,
				new Object[] { name }, Integer.class);

		if (count >= 1)
		{
			return true;
		}
		return false;
	}

}
