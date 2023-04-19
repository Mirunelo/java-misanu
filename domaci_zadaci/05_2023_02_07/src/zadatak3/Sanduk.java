package zadatak3;

import java.text.DecimalFormat;

public class Sanduk extends Teret {
	
	DecimalFormat df = new DecimalFormat("#.###");
	
	// Sanduk je kvadar definisan sa 3 stranice
	private double a, b, c;
	
	// Parametrizovani konstruktor za inicijalizaciju sanduka
	public Sanduk(double st, double a, double b, double c) {
		super(st, 'S');
		this.a = a;
		this.b = b;
		this.c = c;
	}

	// Metoda za određivanje zapremine sanduka
	@Override
	double zapremina() {
		return a * b * c;
	}
	
}
