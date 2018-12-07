package com.ram;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ram.config.AppConfig;
import com.ram.config.RestClient;

public class Main
{

	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				AppConfig.class);

		RestClient client = applicationContext.getBean(RestClient.class);

		client.getToken();
		applicationContext.close();
	}
}
