package uup_Zadatak_02;

public class Student {
	/* Deklarisanje podataka */
	String ime;
	String prezime;
	String adresa;
	int brojIndeksa;

	/* Parametrizovan konstruktor */
	Student(String ime, String prezime, String adresa, int indeks) throws Izuzetak {
		this.ime = ime;
		this.prezime = prezime;
		this.adresa = adresa;
		if (indeks > 0 && indeks < 100)
			brojIndeksa = indeks;
		else
			throw new Izuzetak(indeks);
	}

	/* Metoda za ispisivanje podataka o studentu */
	public void ispisi() {
		System.out.println(ime + "\t" + prezime + "\t" + adresa + "\t" + brojIndeksa);
	}
}