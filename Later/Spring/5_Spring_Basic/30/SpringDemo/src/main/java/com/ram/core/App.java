package com.ram.core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ram.aware.MessageSourceAwareImpl;

public class App
{
	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		MessageSourceAwareImpl messageSourceAwareImpl = applicationContext
				.getBean("messageSourceAware", MessageSourceAwareImpl.class);

		System.out.println("messageSourceAwareImpl = "+messageSourceAwareImpl);
		
		messageSourceAwareImpl.displayMessagesSpecificToLocale();
		
		applicationContext.close();
	}
}
