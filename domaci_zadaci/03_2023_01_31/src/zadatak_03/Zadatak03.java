package zadatak_03;

public class Zadatak03 {

	public static void main(String[] args) {

		/*
		 * Prvo sam zadatak rešio tako što sam štampao broj 2 kao prvi prost broj i
		 * dalje imao vrlo proste if uslove unutar for petlje.
		 * 
		 * Definiciji prostog broja u postavci zadatka fali uslov da broj mora biti veći
		 * od 1.
		 */
		
		System.out.println("Prosti brojevi od 1 do 10:");

		// for petlja počinje od 2 u skladu sa definicijom prostih brojeva
		for (int i = 2; i <= 10; i++) {
			for (int j = 2; j <= i; j++) {
				if (i % j == 0 && i != 2)
					break;
				else if (i == 2 || i == j + 1)
					System.out.print(i + "   ");
			}
		}

	}
}
