package com.ram.model;

public class Employee
{

	private int id;
	private String name;
	private boolean testAndCondition;
	private boolean testOrCondition;
	private boolean testNotCondition;

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

	public boolean isTestAndCondition()
	{
		return testAndCondition;
	}

	public void setTestAndCondition(boolean testAndCondition)
	{
		this.testAndCondition = testAndCondition;
	}

	public boolean isTestOrCondition()
	{
		return testOrCondition;
	}

	public void setTestOrCondition(boolean testOrCondition)
	{
		this.testOrCondition = testOrCondition;
	}

	public boolean isTestNotCondition()
	{
		return testNotCondition;
	}

	public void setTestNotCondition(boolean testNotCondition)
	{
		this.testNotCondition = testNotCondition;
	}

	@Override
	public String toString()
	{
		return "Employee [id=" + id + ", name=" + name + ", testAndCondition="
				+ testAndCondition + ", testOrCondition=" + testOrCondition
				+ ", testNotCondition=" + testNotCondition + "]";
	}

}
