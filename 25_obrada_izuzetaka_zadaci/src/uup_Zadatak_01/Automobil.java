package uup_Zadatak_01;

import java.io.*;

public class Automobil {
	/* Deklarisanje podataka */
	String naziv;
	String proizvodjac;
	int godiste;
	double potrosnja;

	/* Metoda za unos naziva automobila */
	void unetiNazivAutomobila() throws IOException {

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Unesite naziv automobila: ");
		naziv = ulaz.readLine();
	}

	/* Metoda za unos proizvodjača automobila */
	void unetiProizvodjacaAutomobila() throws IOException {

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Unesite proizvodjača automobila: ");
		proizvodjac = ulaz.readLine();
	}
	/* Metoda za unos godišta automobila */

	void unetiGodisteAutomobila() {
		try {

			BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Unesite godište automobila: ");
			godiste = Integer.parseInt(ulaz.readLine());
		} catch (Exception e) {
			System.out.println("Niste dobro uneli broj");
			unetiGodisteAutomobila();

		}

	}

	/* Metoda za unos potrošnje automobila */
	void unetiPotrosnjuAutomobila() {
		while (true) {
			try {
				BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Unesite potrošnju automobila na 100 km: ");
				potrosnja = Double.parseDouble(ulaz.readLine());
				break;
			} catch (Exception e) {
				System.out.println("Niste ispravno uneli potrošnju automobila");
			}
		}
	}

	/* Redefinisana metoda */
	public String toString() {
		return "Naziv: " + naziv + "\nProizvodjač: " + proizvodjac + "\nGodište: " + godiste + "\nPotrošnja: "
				+ potrosnja;
	}
}