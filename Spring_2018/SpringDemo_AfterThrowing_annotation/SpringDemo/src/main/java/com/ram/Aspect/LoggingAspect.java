package com.ram.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect
{

	@AfterThrowing(
			pointcut = "execution(* com.ram.service.EmployeeService.addEmployee())",
			throwing = "exception")
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
