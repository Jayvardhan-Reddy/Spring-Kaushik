package org.jay.springannotations;

import org.springframework.beans.factory.annotation.Required;

public class CircleAnnotations implements ShapeAnnotations {

	private PointAnnotaion center;

	public PointAnnotaion getCenter() {
		return center;
	}

	@Required
	public void setCenter(PointAnnotaion center) {
		this.center = center;
	}

	@Override
	public void draw() {
		System.out.println("Circle = ("+getCenter().getX() + "," + getCenter().getY() +")");
		
	}
}
