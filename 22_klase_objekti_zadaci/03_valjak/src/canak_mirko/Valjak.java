package canak_mirko;

public class Valjak {

	private double r, h;

	Valjak(double rr, double hh) {
		r = rr;
		h = hh;
	}

	Valjak() {
		r = 1;
		h = 1;
	}

	public double getR() {
		return r;
	}

	public double getH() {
		return h;
	}

	public double V() {
		return 3.14 * r * r * h;
	}

	public String opis() {
		return "[" + r + " , " + h + "]";
	}

}
