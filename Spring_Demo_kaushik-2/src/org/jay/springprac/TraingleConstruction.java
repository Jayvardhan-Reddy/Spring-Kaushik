package org.jay.springprac;

public class TraingleConstruction {
	// Constructor injection begins
	private String type;
	private String hi;

	public TraingleConstruction(String type) {
		this.type = type;
	}

	public TraingleConstruction(String type, String hi) {
		this.type = type;
		System.out.println("inside 2 param");
		this.hi = hi;
	}

	public void draw() {
		System.out.println("In constructor Injection");
	}
	// Constructor injection ends

}
