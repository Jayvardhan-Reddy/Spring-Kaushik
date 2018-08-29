package org.jay.springannotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class CircleJSR250Annotaion implements ShapeAnnotations{

	private PointAnnotaion center;

	public PointAnnotaion getCenter() {
		return center;
	}

	
	@Resource
	public void setCenter(PointAnnotaion center) {
		this.center = center;
	}

	
	public void draw() {
		System.out.println("In draw method JSR250 circle ");
		System.out.println("Circle = ("+getCenter().getX() + "," + getCenter().getY() +")");
		
	}
	
	@PostConstruct
	private void init() {
		System.out.println("The init method");

	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("The destroy method");
	}

}
