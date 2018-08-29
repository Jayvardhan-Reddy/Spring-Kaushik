package org.jay.springAOP.aspect;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.aop.aspectj.*;


@Aspect
public class LoggingAspect {

	//@Before("execution(public String getName())")   Generic calls for all getName methods of all classes when getbean is instantiated
	@Before("execution(public String org.jay.springAOP.model.Circle.getName())") //by specifying packeage and class name it is called on particular class instantiation
	public void LoggingAdvice() {
		System.out.println("In the logging advice method ,called on get Method");
	}
	
	@Before("execution(public * *.getName())")
	public void secondAdvice() {
		System.out.println("second advice method");
		
	}
	
}
