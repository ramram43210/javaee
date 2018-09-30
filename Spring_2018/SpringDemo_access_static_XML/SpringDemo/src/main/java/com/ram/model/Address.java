package com.ram.model;

public class Address
{
	public static String STATE = "Karnataka";
	public static String COUNTRY = "India";

	public static String getFullAddres()
	{
		return STATE + "," + COUNTRY;
	}
}
