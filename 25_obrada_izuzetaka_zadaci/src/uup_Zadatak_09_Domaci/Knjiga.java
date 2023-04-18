package uup_Zadatak_09_Domaci;

import java.io.*;

public class Knjiga {

	String naziv;
	String autor;
	String izdavac;

	void unetiNazivKnjige() throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Unesite naziv knjige: ");
		naziv = bf.readLine();
		if (naziv.isBlank()) {
			System.out.println("Niste dobro uneli naziv knjige!");
			unetiNazivKnjige();
		}
	}

	void unetiAutoraKnjige() throws IOException {
		while (autor == null || autor.isBlank()) {
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Unesite autora knjige: ");
			autor = bf.readLine();
		}
	}

	void unetiIzdavacaKnjige() throws IOException {
		do {
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Unesite naziv izdavača knjige: ");
			izdavac = bf.readLine();
		} while (izdavac.isBlank());

	}

}
