package com.ram.core;

import java.util.Set;

public class FruitShop
{
	private String shopName;
	private Set<String> setOfAvailableFruits;

	public FruitShop(String shopName, Set<String> setOfAvailableFruits)
	{
		System.out.println(
				"FruitShop(String shopName, Set<String> setOfAvailableFruits) "
						+ "constructor is called by the Spring container");
		this.shopName = shopName;
		this.setOfAvailableFruits = setOfAvailableFruits;
	}

	public void displayFruitShopInfo()
	{
		System.out.println("FruitShop [shopName=" + shopName
				+ ", setOfAvailableFruits=" + setOfAvailableFruits + "]");
	}

}
