package com.ram.core;

import java.util.List;

import com.ram.model.Fruit;

public class FruitShop
{
	private String shopName;
	private List<Fruit> listOfAvailableFruits;

	public FruitShop(String shopName, List<Fruit> listOfAvailableFruits)
	{
		System.out.println(
				"FruitShop(String shopName, List<Fruit> listOfAvailableFruits) "
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
