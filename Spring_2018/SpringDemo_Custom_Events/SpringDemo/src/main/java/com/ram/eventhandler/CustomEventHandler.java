package com.ram.eventhandler;

import org.springframework.context.ApplicationListener;

import com.ram.events.CustomEvent;

public class CustomEventHandler implements ApplicationListener<CustomEvent>
{
	public void onApplicationEvent(CustomEvent event)
	{
		System.out.println("Received custom event = "+event.toString());
	}
}