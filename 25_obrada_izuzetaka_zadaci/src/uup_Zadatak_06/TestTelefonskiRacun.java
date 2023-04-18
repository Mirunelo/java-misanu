package uup_Zadatak_06;

import java.io.*;

public class TestTelefonskiRacun {

	public static void main(String[] args) throws Exception {

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		/* Kreiranje objekta klase TelefonskiRacun */
		TelefonskiRacun tr = new TelefonskiRacun();
		try {
			/* Unos podataka o telefonskom računu */
			System.out.println("Unesite broj telefona: ");
			String brojTelefona = ulaz.readLine();
			System.out.println("Unesite ime i prezime vlasnika telefona: ");
			String vlasnik = ulaz.readLine();
			System.out.println("Unesite iznos telefonskog računa: ");
			double racun = Double.parseDouble(ulaz.readLine());

			/* Postavljanje podataka o telefonskom računu */
			tr.setBrojTelefona(brojTelefona);
			tr.setVlasnik(vlasnik);
			tr.setDugovanje(racun);

			/* Štampanje podataka o telefonskom računu */
			System.out.println("\nUneti podaci o telefonskom računu su: ");
			System.out.println(tr.toString());
		} catch (Exception e) {
			System.out.println("Greška: " + e.getMessage());
		} finally {
			System.out.println("Hvala što koristite naše usluge!");
		}
	}
}