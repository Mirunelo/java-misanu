package zadatak2;

import java.text.DecimalFormat;

public class Sfera extends Predmet {
	
	DecimalFormat df = new DecimalFormat("#.###");
	
	// Sfera je definisana poluprečnikom r [cm]
	private double r;
	
	// Podrazmevani konstruktor postavlja poluprečnik na 1 cm
	// Oznaku sfere 'S' i specifičnu težinu 1 g/cm kubnom
	public Sfera() {
		super('S', 1.0);
		r = 1.0;
	}
	
	// Parametrizovani konstruktor za inicijalizaciju sfere
	public Sfera(double st, double r) {
		super('S', st);
		this.r = r;
	}
	
	// Metoda za određivanje zapremine sfere
	public double zapremina() {
		return 4 * Math.PI * Math.pow(r, 3) / 3;
	}
	
	// Napomena: Težina se računa u apstraktnoj klasi
	
	// Metoda za sastavljanje tekstualnog opisa sfere
	public String opis() {
		return "\nSfera (" + getOznaka() + ") specifične težine: " + st + " g/cm\u00b3 i poluprečnika r = " + r + " cm\nima zapreminu V = " + df.format(zapremina()) + " cm\u00b3 i težinu: " + df.format(tezina()/1000.0) + " kg.";
	}

}
