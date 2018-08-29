package org.jay.springannotations;

public class TraingleAnnotations implements ShapeAnnotations{

	private PointAnnotaion pointA;
	private PointAnnotaion pointB;
	private PointAnnotaion pointC;
	public PointAnnotaion getPointA() {
		return pointA;
	}
	public void setPointA(PointAnnotaion pointA) {
		this.pointA = pointA;
	}
	public PointAnnotaion getPointB() {
		return pointB;
	}
	public void setPointB(PointAnnotaion pointB) {
		this.pointB = pointB;
	}
	public PointAnnotaion getPointC() {
		return pointC;
	}
	public void setPointC(PointAnnotaion pointC) {
		this.pointC = pointC;
	}
	@Override
	public void draw() {
		System.out.println("PonitA = ("+getPointA().getX() + "," + getPointA().getY() +")");
		System.out.println("PonitB = ("+getPointB().getX() + "," + getPointB().getY() +")");
		System.out.println("PonitC = ("+getPointC().getX() + "," + getPointC().getY() +")");
		
	}
	
}
