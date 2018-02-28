package com.ram.core;

import java.util.List;

public class FruitShop
{
	private String shopName;
	private List<String> listOfAvailableFruits;

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

	public List<String> getListOfAvailableFruits()
	{
		return listOfAvailableFruits;
	}

	public void setListOfAvailableFruits(List<String> listOfAvailableFruits)
	{
		System.out.println(
				"setListOfAvailableFruits(List<String> listOfAvailableFruits) is "
						+ "called by the Spring Container");
		this.listOfAvailableFruits = listOfAvailableFruits;
	}

	public void displayFruitShopInfo()
	{
		System.out.println("FruitShop [shopName=" + shopName
				+ ", listOfAvailableFruits=" + listOfAvailableFruits + "]");
	}

}
