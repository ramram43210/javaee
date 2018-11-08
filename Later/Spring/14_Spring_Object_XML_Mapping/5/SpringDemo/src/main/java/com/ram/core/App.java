package com.ram.core;

import java.io.FileWriter;
import java.io.IOException;

import javax.xml.transform.stream.StreamResult;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.oxm.Marshaller;

import com.ram.core.model.Company;

public class App
{

	public static void main(String[] args) throws IOException
	{
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		Marshaller marshaller = (Marshaller) context
				.getBean("jaxbMarshallerBean");

		// Perform Marshaling
		Company company = new Company();
		company.setId(201);
		company.setCompanyName("Google");
		company.setCeoName("Peter");
		company.setNumberOfEmployees(50000);

		marshaller.marshal(company,
				new StreamResult(new FileWriter("company.xml")));

		System.out.println("XML Created Sucessfully");

	}
}