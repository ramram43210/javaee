package com.ram.core;

/**
 * Spring bean
 *
 */
public class Customer
{
	private String name;

	public Customer(String name)
	{
		System.out.println(this.getClass().getName()
				+ ", Customer(String name) constructor is called, " + name);

		this.name = name;
	}

	public void customerDetails()
	{
		System.out.println("Customer Name =  " + name);
	}
}
