package org.jay.springAOP.model;

public class Circle {

	private String name;

	public String getName() {
		System.out.println("In getter method of circle");
		return name;
		
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("In the setter method of Circle");
	}
}
