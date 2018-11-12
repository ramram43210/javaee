package com.ram.Aspect;

import org.aspectj.lang.JoinPoint;

public class LoggingAspect
{
	public void logAfterReturning(JoinPoint joinPoint, Object result)
	{

		System.out.print("logAfterReturning() is running!");
		System.out.println(", after "
				+ joinPoint.getSignature().getName() + " method");
		System.out.println("Method returned value is = " + result);
		System.out.println("******");
	}

}
