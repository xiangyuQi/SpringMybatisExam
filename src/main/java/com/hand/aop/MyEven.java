package com.hand.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyEven {
	@Pointcut("execution(* com.hand.service.CustomerService.add(..))")
	private void CustomerEvent(){
	}
	
	@Before("CustomerEvent()")
	public void BeforeInsertCustomerEvent(){
		System.out.println("Before	Insert	Customer Data");
	}
	
	@After("CustomerEvent()")
	public void AfterInsertCustomerEvent(){
		System.out.println("After	Insert	Customer Data");	
	}
}
