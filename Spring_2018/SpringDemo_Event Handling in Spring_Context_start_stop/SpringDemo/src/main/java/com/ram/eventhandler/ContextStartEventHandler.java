package com.ram.eventhandler;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class ContextStartEventHandler implements ApplicationListener<ContextStartedEvent>
{
	public void onApplicationEvent(ContextStartedEvent event)
	{
		System.out.println("ContextStartedEvent Received = "+ event);
	}
}
