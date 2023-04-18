package uup_Zadatak_09_Domaci;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {

		Knjiga k1 = new Knjiga();

		k1.unetiNazivKnjige();
		k1.unetiAutoraKnjige();
		k1.unetiIzdavacaKnjige();

		System.out.println("\nNaziv knjige:\t" + k1.naziv);
		System.out.println("Autor knjige:\t" + k1.autor);
		System.out.println("Izdavač knjige:\t" + k1.izdavac);

	}

}
