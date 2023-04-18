package canak_mirko;

public class Box {

	private double width;
	protected double height;
	double depth;

	Box() {
		width = 10;
		height = 10;
		depth = 10;
	}

	double volume() {
		return width * height * depth;
	}

}
