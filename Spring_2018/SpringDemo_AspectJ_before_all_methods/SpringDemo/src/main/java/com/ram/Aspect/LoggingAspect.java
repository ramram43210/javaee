package com.ram.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect
{

	@Before("execution(* com.ram.service.EmployeeService.*Employee(..))")
	public void logBefore(JoinPoint joinPoint)
	{

		System.out.print("logBefore() is running!");
		System.out.println(", before "
				+ joinPoint.getSignature().getName() + " method");
	}

}
