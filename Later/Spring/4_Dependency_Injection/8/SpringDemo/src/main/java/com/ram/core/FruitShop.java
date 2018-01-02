package com.ram.core;

import java.util.List;

public class FruitShop
{
	private String shopName;
	private List<String> listOfAvailableFruits;

	public FruitShop(String shopName, List<String> listOfFruits)
	{
		System.out.println(
				"FruitShop(String shopName, List<String> listOfFruits) "
						+ "constructor is called by the Spring container");
		this.shopName = shopName;
		this.listOfAvailableFruits = listOfFruits;
	}

	public void displayFruitShopInfo()
	{
		System.out.println("FruitShop [shopName=" + shopName
				+ ", listOfAvailableFruits=" + listOfAvailableFruits + "]");
	}

}
