package zadatak5;

public class Main {

	public static void main(String[] args) {

		// Pravim trkački auto sa dve vožnje
		TrkackiAuto auto = new TrkackiAuto(998, 2);
		
		// Dodajem prvu vožnju i 3 etape:
		auto.dodajVoznju(3);
		auto.dodajEtapu(13, 97);
		auto.dodajEtapu(36, 93);
		auto.dodajEtapu(27, 103);
		
		// Greška! -> ne može se dodati 4. etapa u vožnju koja ima 3 etape.
		auto.dodajEtapu(18, 99);
		
		// Dodajem drugu vožnju i 3 etape:
		auto.dodajVoznju(3);
		auto.dodajEtapu(17, 99);
		auto.dodajEtapu(23, 103);
		auto.dodajEtapu(13, 113);
		
		// Greška! Treća vožnja se ne može dodati jer smo definisali kapacitet 2 vožnje
		auto.dodajVoznju(3);
		
		// Ispiši automobil
		System.out.println(auto.opis());
		
		// Pravim Bicikl i Kamion zadate težine i nosivosti
		System.out.println();
		Bicikl bicikl = new Bicikl(15);
		Kamion kamion = new Kamion(7925, 11000);
		
		// Štampam Bicikl i Kamion
		System.out.println();
		System.out.println(bicikl.opis());
		System.out.println(kamion.opis());
		
		
		// Dodajem terete u kamion:
		kamion.dodajTovar(1000);
		kamion.dodajTovar(5789);
		
		// Greška! Teret se ne može dodati jer će pretovariti kamion
		kamion.dodajTovar(4556);
		
		// Štampam trenutno stanje kamiona
		System.out.println(kamion.opis());
		
		// Istovarujem teret iz kamiona
		kamion.skiniTovar(2654);
		
		// Kada želim da istovarim više tovara nego što ima kamion je prazan
		kamion.skiniTovar(22000);
		
		// Štampam ispražnjen kamion
		System.out.println();
		System.out.println(kamion.opis());
		
	}

}
