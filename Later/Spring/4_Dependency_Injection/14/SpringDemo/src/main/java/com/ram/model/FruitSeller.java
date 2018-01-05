package com.ram.model;

public class FruitSeller
{
	private String name;
	private String emailId;

	public FruitSeller(String name, String emailId)
	{
		System.out.println("FruitSeller(String name, String emailId) "
				+ "constructor is called by the Spring container");

		this.name = name;
		this.emailId = emailId;
	}

	@Override
	public String toString()
	{
		return "FruitSeller [name=" + name + ", emailId=" + emailId + "]";
	}

}
