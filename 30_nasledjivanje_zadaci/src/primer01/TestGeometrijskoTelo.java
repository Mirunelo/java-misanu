package primer01;

public class TestGeometrijskoTelo {
	public static void main(String[] args) {

		// Kreiranje niza objekata klase Kocka
		Kocka[] k = new Kocka[3];
		k[0] = new Kocka(25.5);
		k[1] = new Kocka(10.5);
		k[2] = new Kocka(5.0);

		// Štampanje rezultata
		for (int i = 0; i < k.length; i++) {
			System.out.println("Površina " + i + ". kocke je " + k[i].izracunajPovrsinu());
			System.out.println("Zapremina " + i + ". kocke je " + k[i].izracunajZapreminu());
		}
	}
}
