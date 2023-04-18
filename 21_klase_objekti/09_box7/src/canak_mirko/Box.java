package canak_mirko;

public class Box {

	private double width;
	private double height;
	private double depth;

	Box(double width, double height, double depth) {
		this.width = width; // mora this. zato što se poklapa ime atributa klase i parametara konstruktora.
		this.height = height;
		this.depth = depth;
	}

	double volume() {
		return width * height * depth;

	}
}
