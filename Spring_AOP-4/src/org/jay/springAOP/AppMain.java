package org.jay.springAOP;

import org.jay.springAOP.service.FactoryService;
import org.jay.springAOP.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {

	public static void main(String[] args) {
		
	//	AopStart
		/*ApplicationContext act = new ClassPathXmlApplicationContext("springAop.xml");
		ShapeService shpsrv = act.getBean("shapeService", ShapeService.class);
		System.out.println(shpsrv.getCircle().getName());
		System.out.println(shpsrv.getTraingle().getName());*/
		//Aop End
		
		//PointCuts and Joinpoint start
	/*	ApplicationContext act = new ClassPathXmlApplicationContext("springPointCutterAop.xml");
		ShapeService shpsrv = act.getBean("shapeService", ShapeService.class);
		System.out.println(shpsrv.getCircle().getName());
		System.out.println(shpsrv.getTraingle().getName());*/
		//PointCuts and Joinpoint ends
		
		//Advice before and After begins
		/*ApplicationContext act = new ClassPathXmlApplicationContext("springAdviceAfterBefore.xml");
		ShapeService shpsrv = act.getBean("shapeService", ShapeService.class);
	//	shpsrv.getCircle().setName("ducking name to gooking circle");
		shpsrv.getCircle();*/
		//Advice before and After ends
		
		//XMLconfiguration way of annotations begin
		/*ApplicationContext act = new ClassPathXmlApplicationContext("springAopXmlConfig.xml");
		ShapeService shpsrv = act.getBean("shapeService", ShapeService.class);
		shpsrv.getCircle();*/
		//XMLconfiguration way of annotations end
		
		//AOP proxy begin
		FactoryService factoryservice = new FactoryService(); // new User defined factory class is writtern to get Bean chk FactoryService.java
		ShapeService shpsrv = (ShapeService)factoryservice.getBean("ShapeService");
		shpsrv.getCircle();
		
		
		
	}

}
