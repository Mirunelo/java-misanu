package zadatak3;

public class Main {
	
	static Ulica ul = new Ulica();

	public static void main(String[] args) {

		// Kreiramo naselje od 2 ulice sa po 2 zgrade:
		
		// Ulica 1
		ul.dodajUlicu("Akrobate Aleksića", 30, 2);
		// Ulica 2
		ul.dodajUlicu("Bulevar Kralja Aleksandra", 1000, 100);
		// Greška -> Duplikat ulice se ne može dodati
		ul.dodajUlicu("Akrobate Aleksića", 30, 2);
		
		// Dodajemo stambene zgrade ulicama 1 i 2:
		dodajZgradu(1, 1, 260.0, 5, 4);
		dodajZgradu(1, 2, 300.0, 6, 5);
		dodajZgradu(2, 10, 600.0, 12, 9);
		dodajZgradu(2, 17, 500.0, 8, 6);
		
		// Greška! -> Ne može se dodati zgrada sa postojećim adresnim brojem
		dodajZgradu(2, 10, 450.5, 6, 6);
		// Greška! -> Ne može se dodati zgrada jer nema slobodnih adresnih brojeva
		dodajZgradu(1, 3, 250, 4, 4);
	
		System.out.println();
		
		// Traženi opis naselja
		System.out.println("Naselje se sastoji od:\n" + ul.opis());
		
		//// Koješta još: ////
		// Promena imena ulice 1
		System.out.print("Ime ulice " + ul.getUlice().get(1).getIme());
		ul.getUlice().get(1).setIme("Cara Nikolaja");
		System.out.println(" je promenjeno u " + ul.getUlice().get(1).getIme());
		// Ukupan broj zgrada ulice 1
		System.out.println("Ukupan broj zgrada ulice " + ul.getUlice().get(1).getIme() + " -> " + ul.getUlice().get(1).ukupanBrZgrada());
		// Ukupna površina svih stambenih jedinica ulice 1
		System.out.println("Ukupna površina svih stambenih jedinica u ulici " + ul.getUlice().get(1).getIme() + " -> " + ul.getUlice().get(1).ukupnaPovrsinaSvihStanova());
		
		System.out.println();
		System.out.println("Naziv ulice 2 -> " + ul.getUlice().get(2).getIme());
		System.out.println("Ukupan broj zgrada ulice " + ul.getUlice().get(2).getIme() + " -> " + ul.getUlice().get(2).ukupanBrZgrada());
		System.out.println("Ukupna površina svih stambenih jedinica u ulici " + ul.getUlice().get(2).getIme() + " -> " + ul.getUlice().get(2).ukupnaPovrsinaSvihStanova());
		
		// Ostali podaci za ulicu 2
		
	}
	
	private static void dodajZgradu(int ulica, int broj, double povrsina, int spratovi, int stanovi) {
		ul.getUlice().get(ulica).dodajZgradu(broj, povrsina, spratovi, stanovi);
	}

}
