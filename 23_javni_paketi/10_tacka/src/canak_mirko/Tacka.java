package canak_mirko;

public class Tacka {

	double x, y;

	Tacka() {

	}

	Tacka(double x) {
		this.x = x;
	}

	Tacka(double x, double y) {
		this.x = x;
		this.y = y;
	}

	double poteg() { /* Rastojanje od koordinatnog početka */
		return Math.sqrt(x * x + y * y);
	}

	double Rastojanje(Tacka t) { /* Rastojanje od zadate tačke */
		return Math.sqrt(Math.pow(x - t.x, 2)) + Math.sqrt(Math.pow(y - t.y, 2));
	}

}
