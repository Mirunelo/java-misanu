package canak_mirko;

public class Box {

	private double width;
	private double height;
	private double depth;

	Box() {
		width = 1;
		height = 1;
		depth = 1;
	}

	Box(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

	Box(double len) {
		width = height = depth = len;
	}

	Box(Box kutijetina) {
		width = kutijetina.width;
		height = kutijetina.height;
		depth = kutijetina.depth;
	}

	double volume() {
		return width * height * depth;
	}

}
