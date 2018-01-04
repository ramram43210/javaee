package com.ram.core;

import java.util.Set;

import com.ram.model.Fruit;

public class FruitShop
{
	private String shopName;
	private Set<Fruit> setOfAvailableFruits;

	public FruitShop(String shopName, Set<Fruit> setOfAvailableFruits)
	{
		System.out.println(
				"FruitShop(String shopName, Set<Fruit> setOfAvailableFruits) "
						+ "constructor is called by the Spring container");
		this.shopName = shopName;
		this.setOfAvailableFruits = setOfAvailableFruits;
	}

	public void displayFruitShopInfo()
	{
		System.out.println("FruitShop [shopName=" + shopName
				+ ", setOfAvailableFruits=" + setOfAvailableFruits + "]");
	}

}
