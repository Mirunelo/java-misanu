package knjizara;

import java.text.DecimalFormat;

public abstract class Artikal {

	private String naziv;
	private double cena;
	private int kolicina;

	Artikal(String n, double c, int k) {
		naziv = n;
		kolicina = k;
		cena = c;
	}

	DecimalFormat df = new DecimalFormat("#.##");

	int kupi() {
		return --kolicina;
	}

	double getCena() {
		return cena * 1.2;
	}

	String opis() {
		return naziv + "\nkoličina: " + kolicina + "\ncena: " + df.format(cena) + "\ncena+PDV: " + df.format(getCena());
	}

}
