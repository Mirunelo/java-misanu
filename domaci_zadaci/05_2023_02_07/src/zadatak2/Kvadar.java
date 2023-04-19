package zadatak2;

import java.text.DecimalFormat;

public class Kvadar extends Predmet {
	
	DecimalFormat df = new DecimalFormat("#.###");
	
	// Kvadar je predmet definisan sa 3 stranice
	private double a, b, c;
	
	// Podrazmevani konstruktor postavlja stranice kvadra na 1 cm
	// Oznaku predmeta 'K' i specifičnu težinu 1 g/cm kubnom
	public Kvadar() {
		super('K', 1.0);
		a = b = c = 1.0;
	}
	
	// Parametrizovani konstruktor za inicijalizaciju kvadra
	public Kvadar(double st, double a, double b, double c) {
		super('K', st);
		this.a = a;
		this.b = b;
		this.c = c;
	}

	// Metoda za određivanje zapremine kvadra
	public double zapremina() {
		return a * b * c;
	}
	
	// Napomena: Težina se računa u apstraktnoj klasi
	
	// Metoda za sastavljanje tekstualnog opisa kvadra
	public String opis() {
		return "\nKvadar (" + getOznaka() + ") specifične težine: " + st + " g/cm\u00b3, dužine stranica izraženih u [cm] i to\na = " + a + " , b = " + b + " , c = " + c + " , zapremine V = " + zapremina() + " cm\u00b3, težak je " + df.format(tezina()/1000) + " kg.";
	}
	
}
