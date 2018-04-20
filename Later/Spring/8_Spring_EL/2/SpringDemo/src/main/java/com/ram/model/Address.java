package com.ram.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("address")
public class Address
{
	@Value("Chennai") //inject String directly
	private String city;
	
	@Value("TamilNadu")
	private String state;

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

	@Override
	public String toString()
	{
		return "Address [city=" + city + ", state=" + state + "]";
	}

}
