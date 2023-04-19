package primer05;

public class TestZaposleni {
	public static void main(String[] args) {

		// Kreiranje objekta klase Referent
		Referent r = new Referent(160.0, 100.0, 10000.0);

		// Kreiranje objekta klase Programer
		Programer p = new Programer(160.0, 120.0, 8200.0, 1500.0);

		// Štampanje rezultata
		System.out.println("Plata referenta je " + r.izracunajPlatu());
		System.out.println("Plata programera je " + p.izracunajPlatu());
	}
}
