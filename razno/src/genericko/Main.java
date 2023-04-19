package genericko;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		// POZIVANJE STATIČKIH METODA:
		// Pozivanje generičke metode sa int argumentom
		Test.generickaStampa(11);
		// Pozivanje generičke metode sa String argumentom
		Test.generickaStampa("Zbogom pameti");
		// Pozivanje generičke metode sa float argumentom itd...
		Test.generickaStampa(1.5f);
		// Pozivanje generičke metode za štampanje niza
		Byte[] nizB = { 0, 1, 2, 0, 2, 1, 2, 1, 0, 1, 0, 2 }; // obavezno Byte, nikako byte
		Test.generickaStampaNiza(nizB);
		Short[] nizS = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 }; // obavezno Short, nikako short
		Test.generickaStampaNiza(nizS);

		// KREIRANJE OBJEKATA GENERIČKE KLASE:
		// Objekat t1
		long a = 654984321654984L;
		double b = Math.PI;
		Test t1 = new Test(a, b);
		// Štampamo objekat t1
		System.out.println("\nŠtampa objekat t1:");
		t1.stampaObjekte();

		// Objekat t2
		ArrayList<Short> c = new ArrayList<Short>();
		c.add((short) 800);
		c.add((short) 900);
		LinkedList<Boolean> d = new LinkedList<Boolean>();
		d.add(true);
		d.add(false);
		Test t2 = new Test(c, d);
		// Štampamo objekat t2
		System.out.println("Štampa objekat t2:");
		t2.stampaObjekte();

		// Kreiranje objekta kojem prosleđujemo niz[]
		Byte[] niz1 = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 }; // Obavezno omotačka klasa Byte, nikako byte
		Test n1 = new Test(niz1);
		// Štampamo niz[]
		n1.stampaNiz();

		// Kreiramo objekat n2
		Test n2 = new Test();
		// Prosleđujemo niz2[] kroz SET-er
		Integer[] niz2 = { 1, 2, 3, 4, 5 }; // Obavezno omotačka klasa Integer umesto int
		n2.setObjekat3(niz2);
		// Štampamo niz2[]
		n2.stampaNiz();

		// Get-ujemo niz[]
		System.out.println("\nGet-ujemo Integer niz i štampamo\n");
		int zbir = 0;
		for (int i = 0; i < n2.getObjekat3().length; i++)
			zbir += (int) n2.getObjekat3()[i]; // Integer Object mora da se kastuje u (int) da bi se sabiralo
		System.out.println("zbir svih elemenata niza: " + zbir);
	}

}
