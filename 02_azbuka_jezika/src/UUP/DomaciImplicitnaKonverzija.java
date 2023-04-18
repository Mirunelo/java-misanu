package UUP;

public class DomaciImplicitnaKonverzija {

	public static void main(String[] args) {
		double d=10;
		int i=(int) d; // int i=d; izazvaće grešku
		System.out.println("d " + d);
		System.out.println("i " + i);
	}

}
