package canak_mirko;

public class ThisUKonstruktoruPrikaz {

	public static void main(String[] args) {

		Box b1 = new Box(10, 15, 20);
		Box b2 = new Box(5, 6, 7);
		
		System.out.println("Zapremina: " + b1.volume());
		System.out.println("Zapremina: " + b2.volume());
		
	}

}
