package com.ram.Advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundAdvice implements MethodInterceptor
{

	public Object invoke(MethodInvocation mi) throws Throwable
	{
		Object obj;
		System.out.println("AroundAdvice applied before actual method = "
				+ mi.getMethod().getName());
		obj = mi.proceed();
		System.out.println("obj = " + obj);
		System.out.println("AroundAdvice applied after actual method =  "
				+ mi.getMethod().getName());
		return obj;
	}

}
