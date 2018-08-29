package org.jay.springAOP.service;

import org.jay.springAOP.aspect.LoggingAspectXmlAnnotation;
import org.jay.springAOP.model.Circle;

public class ShapeServiceProxy extends ShapeService {

	public Circle getCircle()
	{
		new LoggingAspectXmlAnnotation().loggingAdvice(); //acts like before advice annotation
		System.out.println("Inside Shape service proxy method");
		return super.getCircle();
	}
}
