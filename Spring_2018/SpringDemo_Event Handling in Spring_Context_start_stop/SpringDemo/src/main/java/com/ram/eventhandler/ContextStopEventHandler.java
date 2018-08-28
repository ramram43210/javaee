package com.ram.eventhandler;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

public class ContextStopEventHandler implements ApplicationListener<ContextStoppedEvent>
{

	public void onApplicationEvent(ContextStoppedEvent event)
	{
		System.out.println("ContextStoppedEvent Received = "+event);
	}

}
