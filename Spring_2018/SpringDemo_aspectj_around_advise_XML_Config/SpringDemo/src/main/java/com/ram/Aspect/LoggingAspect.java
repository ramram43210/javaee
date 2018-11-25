package com.ram.Aspect;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;

public class LoggingAspect
{
	public void logAround(ProceedingJoinPoint proceedingJoinPoint)
			throws Throwable
	{

		System.out.println("logAround() is running!");
		System.out.println("hijacked method = "
				+ proceedingJoinPoint.getSignature().getName());
		System.out.println("hijacked arguments = "
				+ Arrays.toString(proceedingJoinPoint.getArgs()));

		System.out.println("Around before is running!");
		proceedingJoinPoint.proceed(); // continue on the intercepted
										// method
		System.out.println("Around after is running!");

		System.out.println("******");
	}

}
