package com.ram.Aspect;

import org.aspectj.lang.JoinPoint;

public class LoggingAspect
{
	public void logAfter(JoinPoint joinPoint)
	{

		System.out.print("logAfter() is running!");
		System.out.println(", after "
				+ joinPoint.getSignature().getName() + " method");
		System.out.println("******");
	}

}
