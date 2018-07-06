package com.ram.model;

/*
 * This class is a singleton class
 */
public class Employee
{
	private String name;
	private int age;

	private static Employee employee = null;

	private Employee()
	{
		name = "Peter";
		age = 42;
	}

	public static Employee getEmployee()
	{
		System.out.println("getEmployee() factory method "
				+ "is called by the spring container ");
		if (employee == null)
		{
			employee = new Employee();
		}

		return employee;
	}

	public void displayEmployeeDetails()
	{
		System.out.println("Employee [name=" + name + ", age=" + age + "]");
	}

}
