package com.example.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {
	@Before("execution(* com.example.beans.*.*(..))")
	public void beforeadvice() {
		System.out.println("in before advice");
	}
	@After("execution(* com.example.beans.*.m*(int))")
	public void afteradvice() {
		System.out.println("in after advice");
	}
	@Around("execution(* com.example.beans.*.*(..))")
	public Object aroundadvice(ProceedingJoinPoint jp) throws Throwable  {
		System.out.println("in around advice before function call");
		Object ob = jp.proceed();
		System.out.println("in around advice after function call");
		return ob;
	}

}
