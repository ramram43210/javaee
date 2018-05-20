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

		FruitInfo fruitInfo = (FruitInfo) context.getBean("fruitInfo");
		System.out.println(
				"Got fruitInfo object from the ApplicationContext(Spring container)");
		fruitInfo.displayFruitInfo();
	}

}
