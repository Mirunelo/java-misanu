package uup_Zadatak_05;

import java.io.*;

public class TestCasopis {

	public static void main(String[] args) throws Exception {

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		/* Unos podataka o časopisu */
		System.out.println("Unesite naslov časopisa: ");
		String naslov = ulaz.readLine();
		System.out.println("Unesite izdavač časopisa: ");
		String izdavac = ulaz.readLine();
		System.out.println("Unesite broj časopisa: ");
		int brojCasopisa = Integer.parseInt(ulaz.readLine());
		System.out.println("Unesite cenu časopisa: ");
		double cena = Double.parseDouble(ulaz.readLine());

		/* Kreiranje niza objekata klase Casopis */
		Casopis c = new Casopis();

		try {
			/* Postavljanje podataka o časopisu */
			c.setNaslov(naslov);
			c.setIzdavac(izdavac);
			c.setBrojCasopisa(brojCasopisa);
			c.setCena(cena);

			/* Štampanje podataka o časopisu */
			System.out.println("\nUneti podaci o časopisu su: ");
			System.out.println(c.toString());
		} catch (IzuzetakCasopis e) {
			System.out.println("Greška: " + e.getMessage());
		}
	}
}