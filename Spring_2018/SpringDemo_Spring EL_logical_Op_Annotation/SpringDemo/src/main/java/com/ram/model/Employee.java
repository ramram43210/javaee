package com.ram.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("employee")
public class Employee
{

	@Value("100")
	private int id;

	@Value("Peter")
	private String name;

	@Value("#{medicalInsurence.insuredAmount == 15000 and medicalInsurence.insurencePolicyNumber == 10}")
	private boolean testAndCondition;

	@Value("#{medicalInsurence.insuredAmount == 15000 or medicalInsurence.insurencePolicyNumber == 30}")
	private boolean testOrCondition;

	@Value("#{medicalInsurence.insuredAmount != 15000}")
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
