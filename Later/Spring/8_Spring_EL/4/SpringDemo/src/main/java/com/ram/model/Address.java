package com.ram.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("address")
public class Address
{
	@Value("A220 Bridge Appartment")
	private String street;

	@Value("Chennai")
	private String city;

	@Value("TamilNadu")
	private String state;

	public String getStreet()
	{
		return street;
	}

	public void setStreet(String street)
	{
		this.street = street;
	}

	public String getCity()
	{
		return city;
	}

	public void setCity(String city)
	{
		this.city = city;
	}

	public String getState()
	{
		return state;
	}

	public void setState(String state)
	{
		this.state = state;
	}

	public String getFullAddress()
	{
		return street + "," + city + "," + state;
	}

	@Override
	public String toString()
	{
		return "Address [street=" + street + ", city=" + city + ", state="
				+ state + "]";
	}

}
