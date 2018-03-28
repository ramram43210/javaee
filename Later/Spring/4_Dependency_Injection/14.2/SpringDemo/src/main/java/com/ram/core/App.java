package com.ram.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		System.out.println("---------------------------------------");

		FruitShop fruitShop = (FruitShop) context.getBean("fruitShop");
		System.out.println(
				"Got fruitShop object from the ApplicationContext(Spring Container)");
		fruitShop.displayFruitShopInfo();

	}

}
