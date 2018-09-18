package com.ram.model;

import java.util.LinkedHashMap;
import java.util.Map;

public class AddressInfo
{

	private Map<Integer, String> addressMap;

	public AddressInfo()
	{
		addressMap = new LinkedHashMap<Integer, String>();
		addressMap.put(1, "B220-East Street-London");
		addressMap.put(2, "A220-West Street-London");
		addressMap.put(3, "C220-North Street-London");
	}

	public Map<Integer, String> getAddressMap()
	{
		return addressMap;
	}

	public void setAddressMap(Map<Integer, String> addressMap)
	{
		this.addressMap = addressMap;
	}

	@Override
	public String toString()
	{
		return "AddressInfo [addressMap=" + addressMap + "]";
	}

}
