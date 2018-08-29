package org.jay.springannotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class CircleComponent implements ShapeAnnotations{

		private PointAnnotaion center;

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
