package com.ram.core;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.ram.model.Fruit;

public class FruitShop
{
	private String shopName;
	private Map<Integer, Fruit> mapOfAvailableFruits;

	public FruitShop(String shopName, Map<Integer, Fruit> mapOfAvailableFruits)
	{
		System.out.println(
				"FruitShop(String shopName, Map<Integer, Fruit> mapOfAvailableFruits) "
						+ "constructor is called by the Spring container");
		this.shopName = shopName;
		this.mapOfAvailableFruits = mapOfAvailableFruits;
	}

	public void displayFruitShopInfo()
	{
		System.out.println("Fruit ShopName = " + shopName);

		Set<Entry<Integer, Fruit>> set = mapOfAvailableFruits.entrySet();
		Iterator<Entry<Integer, Fruit>> itr = set.iterator();
		while (itr.hasNext())
		{
			Entry<Integer, Fruit> entry = itr.next();
			System.out.println("Fruit Id = " + entry.getKey()
					+ ", Fruit Info = " + entry.getValue());
		}

	}

}
