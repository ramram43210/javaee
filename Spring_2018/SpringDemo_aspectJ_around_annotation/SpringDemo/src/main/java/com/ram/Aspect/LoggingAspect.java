package com.ram.Aspect;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect
{

	@Around("execution(* com.ram.service.EmployeeService.addEmployee(..))")
	public void logAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable
	{

		System.out.println("logAround() is running!");
		System.out.println("hijacked method = " + proceedingJoinPoint.getSignature().getName());
		System.out.println("hijacked arguments = " + Arrays.toString(proceedingJoinPoint.getArgs()));
			
		System.out.println("Around before is running!");
		proceedingJoinPoint.proceed(); //continue on the intercepted method
		System.out.println("Around after is running!");
			
		System.out.println("******");
	}

}
