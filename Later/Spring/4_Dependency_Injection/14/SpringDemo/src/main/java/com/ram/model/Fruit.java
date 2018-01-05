package com.ram.model;

public class Fruit
{
	private String name;
	private String color;

	public Fruit(String name, String color)
	{
		System.out.println("Fruit(String name, String color) "
				+ "constructor is called by the Spring container");
		this.name = name;
		this.color = color;
	}

	@Override
	public String toString()
	{
		return "Fruit [name=" + name + ", color=" + color + "]";
	}

}
