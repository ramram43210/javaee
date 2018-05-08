package com.ram.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ram.model.Person;

public class App
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		System.out.println("---------------------------------------");

		Person person = (Person) context.getBean("person");
		System.out.println(
				"Got person object from the ApplicationContext(Spring Container)");
		person.displayPersonDetails();
		
		System.out.println("---------------------------------------");
		
		Person personPeter = (Person) context.getBean("personPeter");
		System.out.println(
				"Got personPeter object from the ApplicationContext(Spring Container)");
		personPeter.displayPersonDetails();

	}

}
