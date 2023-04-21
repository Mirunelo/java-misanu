package treeMap;

public class Student {

	// Atributi Student-a
	int indeks;
	String ime, adresa;
	
	// Konstruktor
	public Student(int indeks, String ime, String adresa) {
		this.indeks = indeks;
		this.ime = ime;
		this.adresa = adresa;
	}
	
	// Metoda ove klase koja opisuje Student-a
	public String toString() {
		return this.indeks + " " + this.ime + " " + this.adresa;
	}
	
}
