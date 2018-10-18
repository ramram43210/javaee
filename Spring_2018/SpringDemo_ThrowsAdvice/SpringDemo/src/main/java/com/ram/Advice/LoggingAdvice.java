package com.ram.Advice;

import org.springframework.aop.ThrowsAdvice;

public class LoggingAdvice implements ThrowsAdvice
{

	public void afterThrowing(Exception ex)
	{
		System.out.println(
				"LoggingAdvice applied if exception occurs, exe message = "
						+ ex.getMessage());
	}

}
