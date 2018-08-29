package org.jay.springannotations;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;

public class CircleMessageSource implements ShapeAnnotations{

	private PointAnnotaion center;
	@Autowired
	private MessageSource messageSource;

	public PointAnnotaion getCenter() {
		return center;
	}

	
	public MessageSource getMessagesource() {
		return messageSource;
	}


	public void setMessagesource(MessageSource messagesource) {
		this.messageSource = messagesource;
	}


	@Resource
	public void setCenter(PointAnnotaion center) {
		this.center = center;
	}

	
	public void draw() {
		System.out.println(this.messageSource.getMessage("draw.circle", null,"default message in circle",null));
		/*System.out.println("Circle = ("+getCenter().getX() + "," + getCenter().getY() +")");*/
		System.out.println(this.messageSource.getMessage("circle.point", new Object[] {getCenter().getX(),getCenter().getY()},"default message in circle",null));
		System.out.println(this.messageSource.getMessage("greeting.circle", null,"default message in circle",null));
		
	}
}
