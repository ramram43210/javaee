package com.ram.Aspect;

import org.aspectj.lang.JoinPoint;

public class LoggingAspect
{
	public void logAfterThrowing(JoinPoint joinPoint,
			Throwable exception)
	{

		System.out.print("logAfterThrowing() is running!");
		System.out.println(
				", after " + joinPoint.getSignature().getName()
						+ " method throwing exception");
		System.out.println("exception = " + exception);
		System.out.println("******");
	}

}
