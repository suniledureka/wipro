package com.wipro.boot.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

@Configuration //@Component
@Aspect
public class LoggingAspect {
	//WHEN - what type of method calls to be intercepted - through Pointcut expression
	//@Before("execution(* com.wipro.boot.aop.services.ReportGenerator.*(..))")
	//@Before("execution(boolean com.wipro.boot.aop.services.ReportGenerator.*(..))")
	//@Before("execution(* com.wipro.boot.aop.services.ReportGenerator.*())")  //methods without parameters
	//@Before("execution(* com.wipro.boot.aop.services.ReportGenerator.*Pdf*(..))")
	@Before("execution(* com.wipro.boot.aop.services.*.*(..))")
	public void logBeforeMethodCall(JoinPoint jp) {
		System.out.println("Starting Execution of \"" + jp.getSignature().getName()+"()\" - with "+ jp.getArgs().length + " parameters");
	}
	
	@AfterReturning(pointcut = "execution(* com.wipro.boot.aop.services.*.*(..))", returning = "returnedData" )
	public void logAfterSuccessfulMethodCall(JoinPoint jp, Object returnedData) {
		System.out.println("After Successful Execution of \"" + jp.getSignature().getName()+"()\" - with "+ jp.getArgs().length + " parameters and Returns - "+ returnedData);
	}
	
	@After("execution(* com.wipro.boot.aop.services.*.*(..))")
	public void logAfterMethodCall(JoinPoint jp) {
		System.out.println("After Aspect - " + jp.getSignature().getName()+"()\" got executed");
	}
	
	@AfterThrowing(pointcut = "execution(* com.wipro.boot.aop.services.*.*(..))", throwing = "expt")
	public void logMethodCallAfterException(JoinPoint joinPoint, Exception expt) {
		System.out.println(joinPoint.getSignature().getName() + " \"fired and Exception of type -> " + expt.toString());
	}
}
