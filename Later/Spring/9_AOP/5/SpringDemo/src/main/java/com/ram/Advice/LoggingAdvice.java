package com.ram.Advice;

import java.lang.reflect.Method;
import org.springframework.aop.AfterReturningAdvice;

public class LoggingAdvice implements AfterReturningAdvice
{

	public void afterReturning(Object returnValue, Method method, Object[] args,
			Object target) throws Throwable
	{
		System.out.println("Logging advice is applied after the method "
				+ method.getName() + " in the target Object "
				+ target.getClass().getName());

		for (Object object : args)
		{
			System.out.println(object);
		}

		System.out.println("returnValue = " + returnValue);

	}

}
