package trgovina;

public class MainTest {

	public static void main(String[] args) {

		// Artikli
		Vino v = new Vino(0.75, 978.76);
		Cokolada c = new Cokolada(100, 89.78);

		// Opisi
		System.out.println(v.opis() + "\n");
		System.out.println(c.opis() + "\n");
		
	}

}
