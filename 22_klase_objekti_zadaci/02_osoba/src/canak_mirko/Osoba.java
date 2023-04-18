package canak_mirko;

public class Osoba {

	public String ime, datumRodjenja, adresaStanovanja;

	/*
	 * konstruktor ukoliko ne navedemo konstruktor, pozvaće se podrazumevani
	 * konstruktor
	 */

	public String stampanjeInformacija() {
		return "Ime: " + ime + "\n" + "Datum rođenja: " + datumRodjenja + "\n" + "Adresa: " + adresaStanovanja + "\n";
	}

}
