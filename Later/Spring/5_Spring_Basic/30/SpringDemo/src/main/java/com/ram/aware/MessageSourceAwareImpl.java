package com.ram.aware;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;

public class MessageSourceAwareImpl implements MessageSourceAware
{

	private MessageSource messageSource;

	public void setMessageSource(MessageSource messageSource)
	{
		System.out.println(
				"setMessageSource(MessageSource messageSource) is called "
						+ "by the Spring Container");
		this.messageSource = messageSource;

	}

	public void displayMessagesSpecificToLocale()
	{

		String englishGreet = messageSource.getMessage("greeting", null,
				Locale.US);
		System.out.println("Greeting in English = " + englishGreet);

		String FrenchGreet = messageSource.getMessage("greeting", null,
				Locale.FRENCH);
		System.out.println("Greeting in French  = " + FrenchGreet);
	}

}
