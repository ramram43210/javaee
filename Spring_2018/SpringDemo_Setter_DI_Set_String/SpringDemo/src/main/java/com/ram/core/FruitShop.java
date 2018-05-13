package com.ram.core;

import java.util.Set;

public class FruitShop
{
	private String shopName;
	private Set<String> availableFruitsSet;

	public String getShopName()
	{
		return shopName;
	}

	public void setShopName(String shopName)
	{
		System.out.println("setShopName(String shopName) is "
				+ "called by the Spring Container");
		this.shopName = shopName;
	}

	public Set<String> getAvailableFruitsSet()
	{
		return availableFruitsSet;
	}

	public void setAvailableFruitsSet(Set<String> availableFruitsSet)
	{
		System.out.println(
				"setAvailableFruitsSet(Set<String> availableFruitsSet) is "
						+ "called by the Spring Container");
		this.availableFruitsSet = availableFruitsSet;
	}

	public void displayFruitShopInfo()
	{
		System.out.println("FruitShop [shopName=" + shopName
				+ ", availableFruitsSet=" + availableFruitsSet + "]");
	}

}
