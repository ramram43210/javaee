package com.ram.core;

import java.util.Arrays;

public class FruitShop
{
	private String shopName;
	private String[] fruitsArray;

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

	public String[] getFruitsArray()
	{
		return fruitsArray;
	}

	public void setFruitsArray(String[] fruitsArray)
	{
		System.out.println("setFruitsArray(String[] fruitsArray) is "
				+ "called by the Spring Container");
		this.fruitsArray = fruitsArray;
	}

	public void displayFruitShopInfo()
	{
		System.out.println("FruitShop [shopName=" + shopName + ", fruitsArray="
				+ Arrays.toString(fruitsArray) + "]");
	}

}
