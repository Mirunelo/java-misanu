package canak_mirko;

public class Circle {

	private double radius;

	Circle(/* lista parametara */) { /* Konstruktor bez parametara. */
		radius = 0.0;
	}

	Circle(double radius) { /* Ima jedan parametar ** */
		this.radius = radius;
	}

	Circle(Circle ob) { /* Ima objekat kao parametar *** */
		radius = ob.radius; /* Postupak inicijalizacije polja (atributa) objekta klase */
	}

	double area() {
		return 3.14 * radius * radius;
	}

}
