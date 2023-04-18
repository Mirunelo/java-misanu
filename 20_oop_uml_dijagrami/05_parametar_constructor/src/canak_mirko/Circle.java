package canak_mirko;

public class Circle {
	
	private double radius;
	
	Circle (double rad) { /* Konstruktor klase koji inicijalizuje jedan podatak. */
		radius = rad;
	}

	public double area() {
		return 3.14 * radius * radius;
	}
}
