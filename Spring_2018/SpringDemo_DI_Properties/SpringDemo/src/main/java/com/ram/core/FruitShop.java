package com.ram.core;

import java.util.Properties;

public class FruitShop
{
	private String shopName;
	private Properties availableFruits;

	public FruitShop(String shopName, Properties availableFruits)
	{
		System.out.println(
				"FruitShop(String shopName, Properties availableFruits) "
						+ "constructor is called by the Spring container");
		this.shopName = shopName;
		this.availableFruits = availableFruits;
	}

	public void displayFruitShopInfo()
	{
		System.out.println("FruitShop [shopName=" + shopName
				+ ", availableFruits=" + availableFruits + "]");
	}

}
