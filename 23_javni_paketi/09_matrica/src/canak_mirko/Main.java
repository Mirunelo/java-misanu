package canak_mirko;

public class Main {

	public static void main(String[] args) {

		Matrica m1 = new Matrica(5, 4);

		System.out.println("Matrica ima " + m1.vrs() + " redova.");
		System.out.println("Broj kolona iznosi: " + m1.kol());
		System.out.println();

		/*System.out.println(*/m1.postavi(1, 2, 3)/*);*/;

		System.out.println("Vrednost: " + m1.dohvati(1, 2) + '\n');

		System.out.println(m1.toString());

	}

}
