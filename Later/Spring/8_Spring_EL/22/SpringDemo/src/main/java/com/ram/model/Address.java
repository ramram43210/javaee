package com.ram.model;

import org.springframework.stereotype.Component;

@Component("address")
public class Address
{
	public static String STATE = "Karnataka";
	public static String COUNTRY = "India";

	public static String getFullAddres()
	{
		return STATE + "," + COUNTRY;
	}
}
