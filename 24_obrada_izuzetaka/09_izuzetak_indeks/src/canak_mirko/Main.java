package canak_mirko;

public class Main {

	public static void main(String[] args) {

		int b = 0;
		try {
			int a = 2; /* 0, 1, 2 su vrednosti za testiranje */
			b = 10 / a; /* Rizična opreacija */
			System.out.println("a = " + a);
			System.out.println("Količnik: 10 / " + a + " = " + b);

			try {
				if (a == 1)
					a = a / (a - a);
				if (a == 2) {
					int c[] = { 1 };
					c[a] = 100; /* Rizična operacija */
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				/* unutrašnji catch blok */
				System.out.println("Greška sa indeksom!");
			}

		} catch (ArithmeticException e) {
			/* Spoljašnji catch blok */
			System.out.println("Greška prilikom deljenja!");
		}

	}

}
