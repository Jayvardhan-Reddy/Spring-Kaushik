package org.jay.springprac;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class TraingleLifeCycleCallback implements InitializingBean,DisposableBean { /*for using spring inbuilt init n destroy method interfaces*/

/*	public class TraingleLifeCycleCallback {*/ // user defined destroy n init method
		private Point pointA;
		private Point pointB;
		private Point pointC;

		public Point getPointA() {
			return pointA;
		}

		public void setPointA(Point pointA) {
			this.pointA = pointA;
		}

		public Point getPointB() {
			return pointB;
		}

		public void setPointB(Point pointB) {
			this.pointB = pointB;
		}

		public Point getPointC() {
			return pointC;
		}

		public void setPointC(Point pointC) {
			this.pointC = pointC;
		}

		public void draw() {

			System.out.println("PonitA = ("+getPointA().getX() + "," + getPointA().getY() +")");
			System.out.println("PonitB = ("+getPointB().getX() + "," + getPointB().getY() +")");
			System.out.println("PonitC = ("+getPointC().getX() + "," + getPointC().getY() +")");
		}

		//inbuilt init n destroy methods start
		@Override
		public void afterPropertiesSet() throws Exception {
			
			System.out.println("Default : The bean will be invoked for TraingleLifeCylceCallBack class");
			
		}

		@Override
		public void destroy() throws Exception {
			System.out.println(" Deafut : During the destroying process of bean this method is called");
			
		}
		//inbuilt init n destroy methods end
		
		public void myInit()
		{
			System.out.println("User defined init method called during instantiation of bean");
		}
		
		private void myDestroy() {
			System.out.println("User defined destroy method called during destruction of bean");

		}
		
		
	

}
