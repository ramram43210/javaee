package com.ram.core;

import java.util.Arrays;

import com.ram.model.Fruit;

public class FruitShop
{
	private String shopName;
	private Fruit[] fruitArray;

	public String getShopName()
	{
		return shopName;
	}

	public void setShopName(String shopName)
	{
		this.shopName = shopName;
	}

	public Fruit[] getFruitArray()
	{
		return fruitArray;
	}

	public void setFruitArray(Fruit[] fruitArray)
	{
		this.fruitArray = fruitArray;
	}

	public void displayFruitShopInfo()
	{
		System.out.println("FruitShop [shopName=" + shopName + ", fruitArray="
				+ Arrays.toString(fruitArray) + "]");
	}

}
