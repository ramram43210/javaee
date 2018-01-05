package com.ram.core;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FruitShop
{
	private String shopName;
	private Map<Integer, String> mapOfAvailableFruits;

	public FruitShop(String shopName, Map<Integer, String> mapOfAvailableFruits)
	{
		System.out.println(
				"FruitShop(String shopName, Map<Integer, String> mapOfAvailableFruits) "
						+ "constructor is called by the Spring container");
		this.shopName = shopName;
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
