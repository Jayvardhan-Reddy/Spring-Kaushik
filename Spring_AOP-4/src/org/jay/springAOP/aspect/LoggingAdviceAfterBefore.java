package org.jay.springAOP.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.jay.springAOP.model.Circle;

@Aspect
public class LoggingAdviceAfterBefore {


	/*	@Before("args(name)") //executes before the target method is executed
		public void StringAurgumentMethods(String name){
			System.out.println("In Before Advice Method that takes string argument  " + name);
		}*/
		
		/*@After("args(name)") //executes after the target method is executed even if exeception is thrown in target method this method executes
		public void StringAurgumentAfterMethods(String name){
			System.out.println("In After Advice Method that takes string argument " + name);
		}*/

	/*	@AfterReturning("args(name)") // this method executes only if target method executes successfully
		public void StringAurgumentAfterReturnMethods(String name){
			System.out.println("In AfterReturning Advice Method executes only if target method executes successfully " + name);
		}*/
		
		
	/*	@AfterReturning(pointcut="args(name)",returning="returnString") // this method executes and returns the target output in this method
		public void StringAurgumentAfterReturnMethodsadd(String name,Object returnString){
			System.out.println("In AfterReturning Advice Method executes only if target method executes successfully " + name + "The output of target clubbed in this is " + name);
		}
		*/
	
	
	/*	@Around("allGetters()") //Around advice executes before and after the target method is executed
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
		}*/
	
	
		
		//Using Loggabe annotaion class to call this
		
	@Around("@annotation(org.jay.springAOP.aspect.Loggable)") 
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
		
		
		
		@Pointcut("execution(public * *.get*())")
		public void allGetters(){}
}
