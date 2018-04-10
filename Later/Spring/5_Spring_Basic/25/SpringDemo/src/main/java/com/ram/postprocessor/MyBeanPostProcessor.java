package com.ram.postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor
{

	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException
	{
		System.out.println(
				"Post Process After Initialization for the bean = " + beanName);
		return bean;
	}

	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException
	{
		System.out.println(
				"Post Process Before Initialization for the bean = " + beanName);
		return bean;
	}
}