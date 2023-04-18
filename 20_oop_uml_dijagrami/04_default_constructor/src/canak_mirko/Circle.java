package canak_mirko;

public class Circle {

	private double poluprecnik;

	Circle() {
		poluprecnik = 10.0;
	}

	/*
	 * poluprečnik ima vrednost 10, koja je postavljena u konstruktoru prilikom
	 * kreiranja objekta.
	 */

	double area() {
		return 3.14 * poluprecnik * poluprecnik;
	}
	
	void setPoluprecnik (double r) { /* Postavljanje setera */
		poluprecnik = r;
	}
	
	double getPoluprecnik () { /* Postavljanje getera */
		return poluprecnik;
	}

}
