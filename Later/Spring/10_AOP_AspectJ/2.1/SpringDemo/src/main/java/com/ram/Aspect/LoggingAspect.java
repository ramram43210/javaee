package com.ram.Aspect;

import org.aspectj.lang.JoinPoint;

public class LoggingAspect
{
	public void logBefore(JoinPoint joinPoint)
	{

		System.out.print("logBefore() is running!");
		System.out.println(", before "
				+ joinPoint.getSignature().getName() + " method");
		System.out.println("******");
	}

}
