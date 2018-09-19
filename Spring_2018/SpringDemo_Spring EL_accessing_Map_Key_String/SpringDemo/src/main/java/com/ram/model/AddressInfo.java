package com.ram.model;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component("addressInfo")
public class AddressInfo
{

	private Map<String, String> addressMap;

	public AddressInfo()
	{
		addressMap = new LinkedHashMap<String, String>();
		addressMap.put("East", "B220-East Street-London");
		addressMap.put("West", "A220-West Street-London");
		addressMap.put("North", "C220-North Street-London");
	}

	public Map<String, String> getAddressMap()
	{
		return addressMap;
	}

	public void setAddressMap(Map<String, String> addressMap)
	{
		this.addressMap = addressMap;
	}

	@Override
	public String toString()
	{
		return "AddressInfo [addressMap=" + addressMap + "]";
	}

}
