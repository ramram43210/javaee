package com.ram.core;

import java.util.Set;

import com.ram.model.Fruit;

public class FruitShop
{
	private String shopName;
	private Set<Fruit> availableFruitsSet;

	public String getShopName()
	{
		return shopName;
	}

	public void setShopName(String shopName)
	{
		this.shopName = shopName;
	}

	public Set<Fruit> getAvailableFruitsSet()
	{
		return availableFruitsSet;
	}

	public void setAvailableFruitsSet(Set<Fruit> availableFruitsSet)
	{
		this.availableFruitsSet = availableFruitsSet;
	}

	public void displayFruitShopInfo()
	{
		System.out.println("FruitShop [shopName=" + shopName
				+ ", availableFruitsSet=" + availableFruitsSet + "]");
	}

}
