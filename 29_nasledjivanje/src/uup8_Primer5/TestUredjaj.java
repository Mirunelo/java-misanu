package uup8_Primer5;

public class TestUredjaj {
	
	public static void main(String[] args) {
		
		// Kreiranje objekta klase Uredjaj
		Uredjaj u = new Uredjaj("Samsung", true);
		
		// Kreiranje objekta klase MasinaZaVes
		MasinaZaVes k = new MasinaZaVes("Gorenje", false, 2, 30);
		u.iskljuci();
		
		// Štampanje podataka o uredjaju
		System.out.println("Podaci o uredjaju: ");
		u.ispisi();
		k.ukljuci();
		k.promeniProgramNavise();
		
		// Štampanje podataka o mašini za veš
		System.out.println("\nPodaci o mašini za veš: ");
		k.ispisi();

	}
}