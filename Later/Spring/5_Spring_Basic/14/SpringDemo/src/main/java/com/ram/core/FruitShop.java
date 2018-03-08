package com.ram.core;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FruitShop
{
	private String shopName;
	private Map<Integer, String> mapOfAvailableFruits;

	public String getShopName()
	{
		return shopName;
	}

	public void setShopName(String shopName)
	{
		this.shopName = shopName;
	}

	public Map<Integer, String> getMapOfAvailableFruits()
	{
		return mapOfAvailableFruits;
	}

	public void setMapOfAvailableFruits(
			Map<Integer, String> mapOfAvailableFruits)
	{
		this.mapOfAvailableFruits = mapOfAvailableFruits;
	}

	public void displayFruitShopInfo()
	{
		System.out.println("FruitShop [shopName=" + shopName
				+ ", mapOfAvailableFruits=" + mapOfAvailableFruits + "]");

		System.out.println("Fruit ShopName = " + shopName);
		Set<Entry<Integer, String>> set = mapOfAvailableFruits.entrySet();
		Iterator<Entry<Integer, String>> itr = set.iterator();
		while (itr.hasNext())
		{
			Entry<Integer, String> entry = itr.next();
			System.out.println("Fruit Id = " + entry.getKey()
					+ ", Fruit Name = " + entry.getValue());
		}
	}

}
