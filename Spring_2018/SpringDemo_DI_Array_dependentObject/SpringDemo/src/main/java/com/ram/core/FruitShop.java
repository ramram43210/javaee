package com.ram.core;

import java.util.Arrays;

import com.ram.model.Fruit;

public class FruitShop
{
	private String shopName;
	private Fruit[] fruitArray;

	public FruitShop(String shopName, Fruit[] fruitArray)
	{
		System.out.println(
				"FruitShop(String shopName, Fruit[] fruitArray) "
						+ "constructor is called by the Spring container");
		this.shopName = shopName;
		this.fruitArray = fruitArray;
	}

	public void displayFruitShopInfo()
	{
		System.out.println("FruitShop [shopName=" + shopName
				+ ", fruitArray=" + Arrays.toString(fruitArray) + "]");
	}

}
