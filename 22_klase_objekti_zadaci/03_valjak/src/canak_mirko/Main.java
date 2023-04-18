package canak_mirko;

public class Main {

	public static void main(String[] args) {

		Valjak v1 = new Valjak();
		Valjak v2 = new Valjak(3, 5);

		System.out.println("Zapremina valjka 1: " + v1.opis() + " iznosi " + v1.V());
		System.out.println("Zapremina valjka 2: " + v2.opis() + " iznosi " + v2.V());

	}

}
