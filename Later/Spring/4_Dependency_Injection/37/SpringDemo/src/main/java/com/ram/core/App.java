package com.ram.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ram.model.Animal;

public class App
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		System.out.println("---------------------------------------");

		Animal animal = (Animal)context.getBean("animal");
		System.out.println(
				"Got " + animal +" object from the ApplicationContext[Spring Container]");
		
		animal.eat();
	}

}
