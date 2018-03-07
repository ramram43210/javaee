package com.ram.core;

import java.util.Set;

public class FruitShop
{
	private String shopName;
	private Set<String> setOfAvailableFruits;

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

	public Set<String> getSetOfAvailableFruits()
	{
		return setOfAvailableFruits;
	}

	public void setSetOfAvailableFruits(Set<String> setOfAvailableFruits)
	{
		System.out.println(
				"setSetOfAvailableFruits(Set<String> setOfAvailableFruits) is "
						+ "called by the Spring Container");
		this.setOfAvailableFruits = setOfAvailableFruits;
	}

	public void displayFruitShopInfo()
	{
		System.out.println("FruitShop [shopName=" + shopName
				+ ", setOfAvailableFruits=" + setOfAvailableFruits + "]");
	}

}
