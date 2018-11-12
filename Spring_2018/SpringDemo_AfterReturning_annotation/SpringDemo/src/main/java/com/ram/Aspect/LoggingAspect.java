package com.ram.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect
{

	@AfterReturning(
			pointcut = "execution(* com.ram.service.EmployeeService.addEmployee())",
			returning = "result")
	public void logAfterReturning(JoinPoint joinPoint, Object result)
	{

		System.out.print("logAfterReturning() is running!");
		System.out.println(", after "
				+ joinPoint.getSignature().getName() + " method");
		System.out.println("Method returned value is = " + result);
		System.out.println("******");
	}

}
