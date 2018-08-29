package org.jay.springannotations;

import javax.annotation.Resource;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component
public class CircleEvent implements ShapeAnnotations,ApplicationEventPublisherAware{

	private PointAnnotaion center;
	private ApplicationEventPublisher publish;

	public PointAnnotaion getCenter() {
		return center;
	}

	
	@Resource
	public void setCenter(PointAnnotaion center) {
		this.center = center;
	}

	
	public void draw() {
		System.out.println("In draw method Component circle ");
		System.out.println("Circle = ("+getCenter().getX() + "," + getCenter().getY() +")");
		DrawEvent draweve = new DrawEvent(this);
		publish.publishEvent(draweve);
	}


	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publish) {
		
		this.publish=publish;
		
	}



	
}
