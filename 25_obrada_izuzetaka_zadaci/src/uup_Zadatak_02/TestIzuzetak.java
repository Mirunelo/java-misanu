package uup_Zadatak_02;

import java.io.*;

public class TestIzuzetak {
	public static void main(String[] args) throws IOException {

		/* Deklarisanje podataka */
		String ime;
		String prezime;
		String adresa;
		int indeks;

		/* Kreiranje niza objekata klase Student */
		Student[] student = new Student[10];
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		/* Unos podatka o broju studenata */
		System.out.println("Unesite broj studenata ");
		int n = Integer.parseInt(ulaz.readLine());
		try {
			for (int i = 1; i <= n; i++) {
				/* Unos podataka o studentu */
				System.out.println("Unesite ime " + i + ". studenta");
				ime = ulaz.readLine();
				System.out.println("Unesite prezime " + i + ". studenta");
				prezime = ulaz.readLine();
				System.out.println("Unesite adresu " + i + ". studenta");
				adresa = ulaz.readLine();
				System.out.println("Unesite broj indeksa " + i + ". studenta");
				indeks = Integer.parseInt(ulaz.readLine());
				student[i] = new Student(ime, prezime, adresa, indeks);
			}
			System.out.println("\nIme\tPrezime\tAdresa\tBroj indeksa");
			for (int i = 1; i <= n; i++)
				student[i].ispisi();
		} catch (Izuzetak e) {
			System.out.println(e.getMessage());
			System.out.println("Indeks studenta za koji se desio izuzetak je: " + e.getIndeksStudenta());

		}
	}
}