package knjizara;

import java.text.DecimalFormat;

public class CD extends Artikal {

	private String izvodjac;
	private String zanr;

	CD(String izvodjac, String naziv, String zanr, double cena, int kolicina) {
		super(naziv, cena, kolicina);
		this.izvodjac = izvodjac;
		this.zanr = zanr;
	}

	DecimalFormat df = new DecimalFormat("#.##");

	double cenaCDa() {
		return getCena() * 1.1;
	}

	@Override
	String opis() {
		return "CD:\nAlbum: " + super.opis() + "\nukupna cena sa uvećanjem od 10%: " + df.format(cenaCDa())
				+ "\n\nIzvođač: " + izvodjac + "\nZanr: " + zanr;
	}

}
