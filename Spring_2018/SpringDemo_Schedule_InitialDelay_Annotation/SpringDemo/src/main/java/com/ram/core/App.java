package com.ram.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"Spring-Scheduler.xml");
	}
}
