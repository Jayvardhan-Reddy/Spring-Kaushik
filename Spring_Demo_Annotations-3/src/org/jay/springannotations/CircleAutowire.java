package org.jay.springannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class CircleAutowire implements ShapeAnnotations{

		private PointAnnotaion center;

		public PointAnnotaion getCenter() {
			return center;
		}

		@Autowired
		@Qualifier("CircleRelated")
		public void setCenter(PointAnnotaion center) {
			this.center = center;
		}

		@Override
		public void draw() {
			System.out.println("In autowire ");
			System.out.println("Circle = ("+getCenter().getX() + "," + getCenter().getY() +")");
			
		}
	

}
