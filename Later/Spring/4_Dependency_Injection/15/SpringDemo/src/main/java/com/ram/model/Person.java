package com.ram.model;

public class Person
{

	private int numberOfLegs;
	private int numberOfHands;
	private int id;
	private String name;

	public Person(int numberOfLegs, int numberOfHands)
	{
		System.out.println("Person(int numberOfLegs, int numberOfHands) "
				+ "constructor is called by the Spring container");
		this.numberOfLegs = numberOfLegs;
		this.numberOfHands = numberOfHands;
	}

	public Person(int numberOfLegs, int numberOfHands, int id, String name)
	{
		System.out.println(
				"Person(int numberOfLegs, int numberOfHands, int id, String name) "
						+ "constructor is called by the Spring container");
		this.numberOfLegs = numberOfLegs;
		this.numberOfHands = numberOfHands;
		this.id = id;
		this.name = name;
	}

	public void displayPersonDetails()
	{
		System.out.println("Person [id=" + id + ", name=" + name
				+ ", numberOfLegs=" + numberOfLegs + ", numberOfHands="
				+ numberOfHands + "]");
	}

}
