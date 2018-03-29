package com.ram.core;

import java.util.Properties;

public class FruitShop
{
	private String shopName;
	private Properties availableFruits;
	
	public String getShopName()
	{
		return shopName;
	}

	public void setShopName(String shopName)
	{
		this.shopName = shopName;
	}

	public Properties getAvailableFruits()
	{
		return availableFruits;
	}

	public void setAvailableFruits(Properties availableFruits)
	{
		this.availableFruits = availableFruits;
	}

	public void displayFruitShopInfo()
	{
		System.out.println("FruitShop [shopName=" + shopName
				+ ", availableFruits=" + availableFruits + "]");
	}

}
