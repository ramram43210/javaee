package com.ram.model;

public class Employee
{

	private int id;
	private String name;
	private int testAdd;
	private int testSubtraction;
	private int testMultiplication;
	private int testDivision;
	private int testModulus;
	private long testExponentialPower;

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

	public int getTestAdd()
	{
		return testAdd;
	}

	public void setTestAdd(int testAdd)
	{
		this.testAdd = testAdd;
	}

	public int getTestSubtraction()
	{
		return testSubtraction;
	}

	public void setTestSubtraction(int testSubtraction)
	{
		this.testSubtraction = testSubtraction;
	}

	public int getTestMultiplication()
	{
		return testMultiplication;
	}

	public void setTestMultiplication(int testMultiplication)
	{
		this.testMultiplication = testMultiplication;
	}

	public int getTestDivision()
	{
		return testDivision;
	}

	public void setTestDivision(int testDivision)
	{
		this.testDivision = testDivision;
	}

	public int getTestModulus()
	{
		return testModulus;
	}

	public void setTestModulus(int testModulus)
	{
		this.testModulus = testModulus;
	}

	public long getTestExponentialPower()
	{
		return testExponentialPower;
	}

	public void setTestExponentialPower(long testExponentialPower)
	{
		this.testExponentialPower = testExponentialPower;
	}

	@Override
	public String toString()
	{
		return "Employee [id=" + id + ", name=" + name + ", testAdd=" + testAdd
				+ ", testSubtraction=" + testSubtraction
				+ ", testMultiplication=" + testMultiplication
				+ ", testDivision=" + testDivision + ", testModulus="
				+ testModulus + ", testExponentialPower=" + testExponentialPower
				+ "]";
	}

}
