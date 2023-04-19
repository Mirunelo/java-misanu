package canak_mirko;

public class Main {

	public static void main(String[] args) {

		AB<Integer, String> objekat1 = new AB<Integer, String>(100, "Java");

		objekat1.prikaziTip();

		int intvrednost = objekat1.getObj1();
		System.out.println("Vrednost: " + intvrednost);

		String strvrednost = objekat1.getObj2();
		System.out.println("Vrednost: " + strvrednost);

		AB<String, Double> objekat2 = new AB<String, Double>("tekst123", 123.45);
		objekat2.prikaziTip();

		String s2 = objekat2.getObj1();
		System.out.println("Vrednost: " + s2);

		double d2 = objekat2.getObj2();
		System.out.println("Vrednost:" + d2);

		AB<Boolean, Integer> objekat3 = new AB<Boolean, Integer>(true, 101);
		objekat3.prikaziTip();

		Boolean b3 = objekat3.getObj1();
		System.out.println("Vrednost: " + b3);

		int i3 = objekat3.getObj2();
		System.out.println("Vrednost: " + i3);

	}

}
