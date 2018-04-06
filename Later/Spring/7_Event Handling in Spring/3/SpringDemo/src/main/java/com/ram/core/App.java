package com.ram.core;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ram.eventpublisher.CustomEventPublisher;

public class App
{
	public static void main(String[] args)
	{
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		CustomEventPublisher customEventPublisher = (CustomEventPublisher) context
				.getBean("customEventPublisher");

		customEventPublisher.publish();
		customEventPublisher.publish();
	}

}
