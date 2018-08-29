package com.dependency_basic;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application app = new Application();
		Shape shape = new Circle();
		app.myDrawMethod(shape);
	//	Application ap = (Application) new Circle();
	//	Circle cr = new Application();
		
		Drawings draw = new Drawings();
		draw.setShape(shape);
		draw.drawShape();
		
		
		
		
	}

	private void myDrawMethod(Shape shape) {
		// TODO Auto-generated method stub
		shape.draw();

	}
	
}
