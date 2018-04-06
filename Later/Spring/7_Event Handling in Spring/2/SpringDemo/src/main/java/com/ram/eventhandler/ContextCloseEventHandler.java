package com.ram.eventhandler;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;

public class ContextCloseEventHandler implements ApplicationListener<ContextClosedEvent>
{

	public void onApplicationEvent(ContextClosedEvent event)
	{
		System.out.println("ContextClosedEvent Received = "+event);
	}

}
