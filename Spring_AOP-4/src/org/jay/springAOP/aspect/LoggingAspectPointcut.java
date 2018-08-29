package org.jay.springAOP.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.jay.springAOP.model.Circle;

@Aspect
public class LoggingAspectPointcut {

	
/*	@Before("allGetters() && allCircleMethods()") //by specifying packeage and class name it is called on particular class instantiation
	public void LoggingAdvice() {
		System.out.println("In the logging advice method ,called on get Method");
	}
	
	@Before("allGetters()")
	public void secondAdvice() {
		System.out.println("second advice method");	
	}*/
	
	
	//JoinPOINT begin
	@Before("allCircleMethods()")
	public void LoggingAdvice(JoinPoint joinpoint)
	{
		System.out.println(joinpoint.toString()); //to  get the name of the method executed
		System.out.println(joinpoint.getTarget()); //to get object id of the target class called
		Circle circle = (Circle)joinpoint.getTarget();
		circle.getName();
	}
	
	@Pointcut("execution(public * *.get*())")
	public void allGetters(){}
	
	@Pointcut("within(org.jay.springAOP.model.Circle)")
	public void allCircleMethods(){}
}
