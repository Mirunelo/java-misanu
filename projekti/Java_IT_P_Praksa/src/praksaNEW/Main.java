package praksaNEW;

public class Main {

	public static void main(String[] args) {

		// Kreiramo objekat klase Osobe:
		Osobe o = new Osobe();

		// 1. Podaci o osobama
		System.out.println("1. Lista Osoba:");
		o.listaPodataka();
		System.out.println();

		// 2. Štampamo sve poruke osobe Daenerys
		System.out.print("2. ");
		o.stampajPoruke("Daenerys");

		// 3. Obaveštenje o broju poruka svake osobe
		System.out.print("\n3. ");
		o.brPorukaSvihOsoba();

		// 4 i 5. Analiza Happy/Sad
		System.out.print("\n4. ");
		o.sadOrHappy();
		
		// 6. Analiza Loving smajlija
		System.out.println("\n6. Da li Jon voli Daenerys više nego što ona voli njega?\n");
		o.odmeriLjubav("Jon", "Daenerys");

	}
}
