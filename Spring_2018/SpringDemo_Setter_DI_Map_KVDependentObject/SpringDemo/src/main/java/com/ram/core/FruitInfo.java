package com.ram.core;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.ram.model.Fruit;
import com.ram.model.FruitSeller;

public class FruitInfo
{
	private Map<FruitSeller, Fruit> mapOfFruitSellerAndFruit;

	public Map<FruitSeller, Fruit> getMapOfFruitSellerAndFruit()
	{
		return mapOfFruitSellerAndFruit;
	}

	public void setMapOfFruitSellerAndFruit(
			Map<FruitSeller, Fruit> mapOfFruitSellerAndFruit)
	{
		this.mapOfFruitSellerAndFruit = mapOfFruitSellerAndFruit;
	}

	public void displayFruitInfo()
	{
		System.out.println("FruitInfo [mapOfFruitSellerAndFruit="
				+ mapOfFruitSellerAndFruit + "]");

		Set<Entry<FruitSeller, Fruit>> set = mapOfFruitSellerAndFruit
				.entrySet();

		Iterator<Entry<FruitSeller, Fruit>> itr = set.iterator();
		while (itr.hasNext())
		{
			Entry<FruitSeller, Fruit> entry = itr.next();
			System.out.println("FruitSeller = " + entry.getKey() + ", Fruit = "
					+ entry.getValue());
		}

	}

}
