package com.ram.core;

import java.util.Arrays;

public class FruitShop
{
	private String shopName;
	private String[] fruitsArray;

	public FruitShop(String shopName, String[] fruitsArray)
	{
		System.out.println(
				"public FruitShop(String shopName, String[] fruitsArray) "
						+ "constructor is called by the Spring container");
		this.shopName = shopName;
		this.fruitsArray = fruitsArray;
	}

	public void displayFruitShopInfo()
	{
		System.out.println("FruitShop [shopName=" + shopName + ", fruitsArray="
				+ Arrays.toString(fruitsArray) + "]");
	}

}
