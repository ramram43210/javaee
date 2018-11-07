package com.ram.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect
{

	@After("execution(* com.ram.service.EmployeeService.addEmployee())")
	public void logAfter(JoinPoint joinPoint)
	{

		System.out.print("logAfter() is running!");
		System.out.println(", after "
				+ joinPoint.getSignature().getName() + " method");
		System.out.println("******");
	}

}
