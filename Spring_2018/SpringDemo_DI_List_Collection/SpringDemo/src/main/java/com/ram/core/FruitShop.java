package com.ram.core;

import java.util.List;

public class FruitShop
{
	private String shopName;
	private List<String> listOfAvailableFruits;

	public FruitShop(String shopName, List<String> listOfAvailableFruits)
	{
		System.out.println(
				"FruitShop(String shopName, List<String> listOfAvailableFruits) "
						+ "constructor is called by the Spring container");
		this.shopName = shopName;
		this.listOfAvailableFruits = listOfAvailableFruits;
	}

	public void displayFruitShopInfo()
	{
		System.out.println("FruitShop [shopName=" + shopName
				+ ", listOfAvailableFruits=" + listOfAvailableFruits + "]");
	}

}
