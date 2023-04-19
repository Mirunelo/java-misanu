package zadatak3;

public class Main {

	public static void main(String[] args) {

		// Kreiramo policu kapaciteta 5 mesta i nosivosti 40 kg.
		Polica p = new Polica(5, 40);

		// Testiramo:
		// Stavi predmete težine 5 i 6 kg na mesto 1 i 3
		p.staviPredmet(1, 5);
		p.staviPredmet(3, 6);

		// Stavi predmet težine 14 kg na prvo prazno mesto, a to je 2
		p.staviPredmetNaPraznoMesto(14);

		// Pogledaj predmete na mestima 1, 2 i 3
		p.pogledajPredmet(1);
		p.pogledajPredmet(2);
		p.pogledajPredmet(3);

		// Stavi predmet težine 15 kg na mesto 4 police
		p.staviPredmet(4, 15);

		// Pokušaj stavljanja predmeta od 3.5 kg koji bi preopteretio policu
		p.staviPredmetNaPraznoMesto(3.5);

		// Pogledaj predmet na mestu 4
		p.pogledajPredmet(4);

		// Pogledaj prazno mesto br 5 na polici
		p.pogledajPredmet(5);

		// Uzmi predmet koji je bio na mestu broj 1
		p.uzmiPredmet(1);

		// Pogledaj prazno mesto br 1 na polici
		p.pogledajPredmet(1);

		// Stavi predmet težak 2 kg na prvo prazno mesto (br 1)
		p.staviPredmetNaPraznoMesto(2);

		// Pogledaj predmet na mestu br 1
		p.pogledajPredmet(1);

		// Pokušaj stavljanja predmeta koji za 0.5 kg prekoračuje nosivost police
		p.staviPredmetNaPraznoMesto(3.5);

		// Pokušaj stavljanja predmeta na zauzeto mesto 3 na polici
		p.staviPredmet(3, 2.5);

		// Opis police:
		System.out.println("\n" + p.opisPolice());

		// Stavljamo poslednji predmet na prazno mesto
		p.staviPredmetNaPraznoMesto(2.5);

		// Dohvatamo podatke o polici i ispisujemo
		System.out.println("\nkapacitet: " + p.kapacitetPolice() + "\n" + "br. popunjenih mesta: "
				+ p.brPopunjenihMesta() + "\nnosivost: " + p.nosivostPolice() + "\nteret na polici: " + p.ukupanTeret()
				+ "\nmože da se doda još: " + p.ostaloNosivosti() + "\n");

		// Praznimo policu
		p.isprazniPolicu();

		// Štampamo opis prazne police
		System.out.println(p.opisPolice());
	}

}
