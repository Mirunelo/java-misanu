package primer03;

public class TestKartica {

	public static void main(String[] args) {

		// Kreiranje objekta klase Master
		Master m = new Master("kreditna", "Milan Gocic", 121314);

		// Štampanje podataka o master kartici
		System.out.println("Podaci o master kartici: ");
		m.ispisi();
	}

}
