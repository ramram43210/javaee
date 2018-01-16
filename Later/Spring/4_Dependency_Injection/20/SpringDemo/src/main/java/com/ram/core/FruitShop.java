package com.ram.core;

import java.util.List;

import com.ram.model.Fruit;

public class FruitShop
{
	private String shopName;
	private List<Fruit> listOfAvailableFruits;
	
	public String getShopName()
	{
		return shopName;
	}

	public void setShopName(String shopName)
	{
		this.shopName = shopName;
	}

	public List<Fruit> getListOfAvailableFruits()
	{
		return listOfAvailableFruits;
	}

	public void setListOfAvailableFruits(List<Fruit> listOfAvailableFruits)
	{
		this.listOfAvailableFruits = listOfAvailableFruits;
	}

	public void displayFruitShopInfo()
	{
		System.out.println("FruitShop [shopName=" + shopName
				+ ", listOfAvailableFruits=" + listOfAvailableFruits + "]");
	}

}
