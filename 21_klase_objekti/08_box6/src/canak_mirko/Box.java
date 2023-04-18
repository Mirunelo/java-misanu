package canak_mirko;

public class Box {

	private double width;
	private double height;
	private double depth;

	Box(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

	double volume() {
		return width * height * depth;
	}
}
