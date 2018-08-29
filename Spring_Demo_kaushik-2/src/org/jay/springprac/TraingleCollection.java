package org.jay.springprac;

import java.util.List;

public class TraingleCollection {
	
private	List<Point> points;

public List<Point> getPoints() {
	return points;
}

public void setPoints(List<Point> points) {
	this.points = points;
}


public void draw(){
	for(Point point : points)
	{
		System.out.println("Points are = ("+ point.getX() + "," + point.getY() +")");
	}
}

}
