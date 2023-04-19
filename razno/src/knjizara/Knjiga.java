package knjizara;

import java.text.DecimalFormat;

public class Knjiga extends Artikal {

	private String autorKnjige;
	private int godinaIzdanja;
	private String izdavac;

	Knjiga(String naziv, String autorKnjige, int godinaIzdanja, String izdavac, double cena, int kolicina) {
		super(naziv, cena, kolicina);
		this.autorKnjige = autorKnjige;
		this.godinaIzdanja = godinaIzdanja;
		this.izdavac = izdavac;
	}

	DecimalFormat df = new DecimalFormat("#.##");

	double cenaKnjige() {
		return getCena() * 1.05;
	}

	@Override
	String opis() {
		return "Knjiga:\nNaslov: " + super.opis() + "\nukupna cena sa uvećanjem od 5%: " + df.format(cenaKnjige())
				+ "\n\nAutor: " + autorKnjige + "\nGodina izdanja: " + godinaIzdanja + "\nIzdavač: " + izdavac;
	}

}
