package com.ram.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component("addressInfo")
public class AddressInfo
{

	private List<String> addressList;

	public AddressInfo()
	{
		addressList = new ArrayList<String>();
		addressList.add("B220, East Street, London");
		addressList.add("A220, West Street, London");
		addressList.add("C220, North Street, London");
	}

	public List<String> getAddressList()
	{
		return addressList;
	}

	public void setAddressList(List<String> addressList)
	{
		this.addressList = addressList;
	}

	@Override
	public String toString()
	{
		return "AddressInfo [addressList=" + addressList + "]";
	}

}
