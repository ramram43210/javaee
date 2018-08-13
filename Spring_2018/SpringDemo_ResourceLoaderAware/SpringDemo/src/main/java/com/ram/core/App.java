package com.ram.core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ram.aware.ResourceLoaderAwareImpl;

public class App
{
	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		ResourceLoaderAwareImpl resourceLoaderAwareImpl = applicationContext
				.getBean("resourceLoaderAware", ResourceLoaderAwareImpl.class);

		System.out.println("resourceLoaderAwareImpl = "+resourceLoaderAwareImpl);
		
		resourceLoaderAwareImpl.displayFileInfo();
		
		applicationContext.close();
	}
}
