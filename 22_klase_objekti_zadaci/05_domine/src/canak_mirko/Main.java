package canak_mirko;

public class Main {

	public static void main(String[] args) {

		Domina d1 = new Domina(2, 4);
		Domina d2 = new Domina(3, 4);

		System.out.println(d1.ista(d2));
		System.out.println(d1.okreni());
		System.out.println("Prva domina: " + d1.toString());
		System.out.println("Druga domina: " + d2.toString());

	}

}
