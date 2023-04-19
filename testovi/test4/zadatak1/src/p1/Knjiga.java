package p1;

public class Knjiga {

	private String naslov, autor, opis;
	private double cena;
	private boolean naStanju;

	public Knjiga() {

	}

	public Knjiga(String n, String a, String o, double c, boolean s) {

		naslov = n;
		autor = a;
		opis = o;
		cena = c;
		naStanju = s;

	}

	public void setNaslov(String i) {
		naslov = i;
	}

	public String getNaslov() {
		return naslov;
	}

	public void setAutor(String a) {
		autor = a;
	}

	public String getAutor() {
		return autor;
	}

	public void setOpis(String o) {
		opis = o;
	}

	public String getOpis() {
		return opis;
	}

	public void setCena(double c) {
		cena = c;
	}

	public double getCena() {
		return cena;
	}

	public void setNaStanju(boolean s) {
		naStanju = s;
	}

	public boolean getNaStanju() {
		return naStanju;
	}

	public String opisKnjige() {
		return "\nKnjiga: " + naslov + "\nPisac: " + autor + "\nKratak opis: " + opis + "\nCena: " + cena
				+ "\nNa stanju: " + naStanju;
	}

}
