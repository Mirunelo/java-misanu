package canak_mirko;

public class ProsledjivanjeObjektaMetodiPrikaz {

	/* Prosleđivanje objekta metodi */

	public static void main(String[] args) {

		Circle c1 = new Circle(20); /* pravimo objekat (instancu) klase */
		Circle c2 = new Circle(30);
		/* moglo je prosto: */
		System.out.println("Površ kruga c1 prosto iznosi: " + c1.area());
		System.out.println("Površ kruga c2 prosto iznosi: " + c2.area());
		calcArea(c1); /* poziv konkretno za objekat c1 */
		calcArea(c2); /* poziv konkretno za objekat c2 */
		racunajObim(c1);
		racunajObim(c2);

	}

	private static void racunajObim(Circle c) {
		System.out.println("Obim kruga: " + c.obim());
		
	}

	/*
	 * c1 cs c? bilosta je parametar unutar statičke metode calcArea. Opše računanje
	 * površine kruga za bilo koji parametar.
	 */

	static void calcArea(Circle objekat) {
		System.out.println("Površina kruga: " + objekat.area());
	}

}
