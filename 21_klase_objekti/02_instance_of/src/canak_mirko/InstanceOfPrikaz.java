package canak_mirko;

public class InstanceOfPrikaz {

	public static void main(String[] args) {

		ABC a = new ABC(); // Objekat a je kreiran.

		XYZ x = new XYZ(); // Objekat x je kreiran.

		ABC h = null;

		XYZ[] m = new XYZ[5]; // deklarišem niz od 5 objekata m[] klase XYZ, ali ih ne kreiram.

		m[0] = new XYZ(); // Objekat m[0] je kreiran.

		if (a instanceof ABC) {
			System.out.println("a je instanca klase ABC.");
		} else {
			System.out.println("a nije instanca klase ABC.");
		}

		if (x instanceof XYZ) {
			System.out.println("x je instanca klase XYZ.");
		} else {
			System.out.println("x nije instanca klase XYZ.");
		}

		if (h instanceof ABC) {
			System.out.println("h je instanca klase ABC.");
		} else {
			System.out.println("h nije instanca klase ABC.");
		}
		if (m[0] instanceof XYZ) {
			System.out.println("m[0] je instanca klase XYZ.");
		} else {
			System.out.println("m[0] nije instanca klase XYZ.");
		}
		if (m[1] instanceof XYZ) {
			System.out.println("m[1] je instanca klase XYZ.");
		} else {
			System.out.println("m[1] nije instanca klase XYZ.");
		}

	}

}
