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

		OutputHelper outputHelper = (OutputHelper) context.getBean("outputHelper");
		System.out.println(
				"Got outputHelper object from the ApplicationContext(Spring container)");
		
		IOutputGenerator outputGenerator = outputHelper.getOutputGenerator();
		
		System.out.println(outputGenerator.getClass().getName());
		
		outputGenerator.generate();
	}

}
