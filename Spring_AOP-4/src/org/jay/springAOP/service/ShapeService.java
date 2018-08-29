package org.jay.springAOP.service;

import org.jay.springAOP.aspect.Loggable;
import org.jay.springAOP.model.Circle;
import org.jay.springAOP.model.Traingle;

public class ShapeService {

	private Circle circle;
	private Traingle traingle;
	
	@Loggable //is used for annotation class eg : chk Loggable.java under aspect package
	public Circle getCircle() {
		System.out.println("Get circle called");
		return circle;
	}
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	
	public Traingle getTraingle() {
		return traingle;
	}
	public void setTraingle(Traingle traingle) {
		this.traingle = traingle;
	}
}
