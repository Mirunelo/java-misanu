package primer02;

public class TestUredjaj {

	public static void main(String[] args) {

		// Kreiranje objekta klase Uredjaj
		Uredjaj u = new Uredjaj("Samsung", true);

		// Kreiranje objekta klase KlimaUredjaj
		KlimaUredjaj k = new KlimaUredjaj("Gorenje", false, 25);
		u.iskljuci();

		// Štampanje podataka o uredjaju
		System.out.println("Podaci o uredjaju: ");
		u.ispisi();
		k.ukljuci();
		k.povecajTemperaturu();

		// Štampanje podataka o klima uredjaju
		System.out.println("\nPodaci o klima uredjaju: ");
		k.ispisi();
	}

}
