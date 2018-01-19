package com.ram.model;

public class FruitSeller
{
	private String name;
	private String emailId;

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getEmailId()
	{
		return emailId;
	}

	public void setEmailId(String emailId)
	{
		this.emailId = emailId;
	}

	@Override
	public String toString()
	{
		return "FruitSeller [name=" + name + ", emailId=" + emailId + "]";
	}

}
