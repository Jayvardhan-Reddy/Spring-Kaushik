package org.jay.springAOP.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;


public class LoggingAspectXmlAnnotation {

	
	public Object AroundAdvicemethod(ProceedingJoinPoint pjp)
	{
		Object retValue = null;
		try
		{
			System.out.println("In before Advice");
			retValue =	pjp.proceed(); // This invokes or executes the target method
			System.out.println("In returning of around advice");
		}
		catch (Throwable e) {
			// TODO: handle exception
			System.out.println("inside exeception ");
		}
		
		System.out.println("finally after advice method");
		return retValue;
	}
		
	public void loggingAdvice() //used as part of Proxy AOP
	{
		System.out.println("Logging from the advice");
	}
		
}
