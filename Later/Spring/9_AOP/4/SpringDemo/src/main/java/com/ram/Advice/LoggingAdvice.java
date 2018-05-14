package com.ram.Advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class LoggingAdvice implements MethodBeforeAdvice
{

	public void before(Method method, Object[] args, Object target)
			throws Throwable
	{
		System.out.println("Logging advice is applied before the method "
				+ method.getName() + " in the target Object "
				+ target.getClass().getName());
	}

}
