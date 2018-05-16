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

	public String getShopName()
	{
		return shopName;
	}

	public void setShopName(String shopName)
	{
		this.shopName = shopName;
	}

	public Map<Integer, Fruit> getMapOfAvailableFruits()
	{
		return mapOfAvailableFruits;
	}

	public void setMapOfAvailableFruits(
			Map<Integer, Fruit> mapOfAvailableFruits)
	{
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
