package canak_mirko;

import java.io.*;

public class Primer17 {
	public static void main(String[] args) throws Exception {
		double suma = 0, vrednostBoda;
		String[] ime = new String[20];
		double[] brojBodova = new double[20];
		double[] kredit = new double[20];
		double[] clanarina = new double[20];
		double[] licniDohodak = new double[20];
		int brojRadnika;
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		
		// Unos podataka
		System.out.println("Unesite vrednost boda: ");
		vrednostBoda = Double.parseDouble(ulaz.readLine());
		System.out.println("Unesite broj radnika: ");
		brojRadnika = Integer.parseInt(ulaz.readLine());
		System.out.println("Unesite podatke o radnicima: ime, broj bodova, ratu kredita i članarinu: ");
		for (int i = 1; i <= brojRadnika; i++) {
			System.out.println("Podaci za " + i + ". radnika");
			System.out.print("Ime: "); ime[i] = ulaz.readLine();
			System.out.print("Broj bodova: ");
			brojBodova[i] = Double.parseDouble(ulaz.readLine());
			System.out.print("Rata kredita: ");
			kredit[i] = Double.parseDouble(ulaz.readLine());
			System.out.print("Članarina: ");
			clanarina[i] = Double.parseDouble(ulaz.readLine());
			
			// Izračunavanje ličnog dohotka radnika i ukupnog iznosa za isplatu
			licniDohodak[i] = brojBodova[i] * vrednostBoda - kredit[i] - clanarina[i];
			suma += licniDohodak[i];
			}
		
		// Štampanje zaglavlja
		System.out.println("Ime\tBroj bodova\tKredit\tČlanarina\tPlata ");
		
		// Štampanje rezultata
		for (int i = 1; i <= brojRadnika; i++)
			System.out.println(ime[i] + "\t" + brojBodova[i] + "\t" + kredit[i] + "\t" + clanarina[i] + "\t" + licniDohodak[i]);
		System.out.println("===================================================");
		System.out.println("Ukupno za isplatu: \t\t\t" + suma);
	}
}