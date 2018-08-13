package com.ram.core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ram.aware.BeanNameAwareImpl;

public class App
{
	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		BeanNameAwareImpl beanNameAwareImpl = applicationContext
				.getBean("beanNameAware", BeanNameAwareImpl.class);

		System.out.println("beanNameAwareImpl = "+beanNameAwareImpl);
		applicationContext.close();
	}
}
