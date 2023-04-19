package uup9_Primer6;

public class TestOsoba {
	
	public static void main(String[] args) {
		
		// Kreiranje objekta klase Osoba
		Osoba os = new Osoba();
		
		// Postavljanje podataka o osobi
		os.setIme("Laza");
		os.setPrezime("Lazić");
		os.setMaticniBroj("1110977105617");
		
		// Štampanje podataka o osobi
		System.out.println("Podaci o osobi: ");
		System.out.println("Ime osobe: " + os.getIme());
		System.out.println("Prezime osobe: " + os.getPrezime());
		System.out.println("Matični broj osobe: " + os.getMaticniBroj());
		
		// Kreiranje objekta klase Zaposleni
		Zaposleni z = new Zaposleni();
		
		// Postavljanje podataka o zaposlenom
		z.setIme("Mika");
		z.setPrezime("Mikić");
		z.setMaticniBroj("1010988725376");
		z.setProsecnaZarada(18000);
		
		//Štampanje podataka o zaposlenom
		System.out.println("\nPodaci o zaposlenom: ");
		System.out.println("Ime zaposlenog: " + z.getIme());
		System.out.println("Prezime zaposlenog: " + z.getPrezime());
		System.out.println("Matični broj zaposlenog: " + z.getMaticniBroj());
		System.out.println("Prosečna zarada zaposlenog: " + z.getProsecnaZarada());
	}

}