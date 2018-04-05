package com.ram.eventhandler;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

public class ContextRefreshEventHandler implements ApplicationListener<ContextRefreshedEvent>
{
	public void onApplicationEvent(ContextRefreshedEvent event)
	{
		System.out.println("ContextRefreshedEvent Received = "+ event);
	}
}
