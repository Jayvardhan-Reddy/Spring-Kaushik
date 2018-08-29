package org.jay.springAOP.service;

import org.jay.springAOP.model.Circle;
import org.jay.springAOP.model.Traingle;

//We are implementing our own Factory classs to fetch or instantiate the objects
public class FactoryService {

	public Object getBean(String beanType)
	{
		if(beanType.equals("ShapeService")) return new ShapeServiceProxy();
		if(beanType.equals("Circle")) return new Circle();
		if(beanType.equals("Traingle")) return new Traingle();
		return null;
	}
}
