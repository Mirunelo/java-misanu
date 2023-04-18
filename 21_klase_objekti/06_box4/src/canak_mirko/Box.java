package canak_mirko;

public class Box {

	private double width;
	private double height;
	private double depth;

	/*
	 * Nema konstruktora, dakle koristi se podrazumevani koji atribute: width,
	 * height i depth postavlja na 0.0
	 */

	protected void initBox(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

	double volume() {
		return width * height * depth;
	}
}
