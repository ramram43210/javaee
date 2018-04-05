package com.ram.eventpublisher;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

import com.ram.events.CustomEvent;

public class CustomEventPublisher implements ApplicationEventPublisherAware
{
	private ApplicationEventPublisher publisher;

	public void setApplicationEventPublisher(
			ApplicationEventPublisher publisher)
	{
		this.publisher = publisher;
	}

	public void publish()
	{
		CustomEvent customEvent = new CustomEvent(this);
		publisher.publishEvent(customEvent);
	}
}
