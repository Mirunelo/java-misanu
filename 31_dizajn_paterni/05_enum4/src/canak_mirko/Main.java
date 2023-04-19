package canak_mirko;

public class Main {

	public static void main(String[] args) {

		/* ordinal() - dobija redni broj, tj. položaj date konstante na listi konstanti u nabrajanju.
		 * Redni brojevi počinju od 0.
		 */

		System.out.println("R.br - Boja:\n");
		int i = 10;
		for (Boja b : Boja.values()) {
			switch (i % 10) {
			case 0:
				System.out.println(b.ordinal() + ". \033[1;30m" + b + "\033[0m");
				break;
			case 1:
				System.out.println(b.ordinal() + ". \033[1;91m" + b + "\033[0m");
				break;
			case 2:
				System.out.println(b.ordinal() + ". \033[1;92m" + b + "\033[0m");
				break;
			case 3:
				System.out.println(b.ordinal() + ". \033[1;93m\033[40m" + b + "\033[0m");
				break;
			case 4:
				System.out.println(b.ordinal() + ". \033[1;34m" + b + "\033[0m");
				break;
			case 5:
				System.out.println(b.ordinal() + ". \033[1;95m" + b + "\033[0m");
				break;
			case 6:
				System.out.println(b.ordinal() + ". \033[1;96m" + b + "\033[0m");
				break;
			case 7:
				System.out.println(b.ordinal() + ". \033[1;97m\033[40m" + b + "\033[0m");
				break;
			case 8:
				System.out.println("\n" + b.ordinal() + ". " + b + " boja");
				break;
			default:
				System.out.println("\n" + b.ordinal() + ". " + b
						+ " boja...\n\033[1;97m\033[44m\nYour PC run into a problem and needs to restart !!!\033[0m\n");
			}

			i++;

		}

		/* compareTo() - poredi redne brojeve dveju konstanti iz istog nabrajanja.
		 * Ako je redni broj pozivajuće konstante manji od rednog broja konstante,
		 * metoda compareTo() vraća negativan broj.
		 * 
		 * Ukoliko su redni brojevi jednaki, metoda compareTo() vraća nulu.
		 * 
		 * Ako pozivajuća konstanta ima redni broj veći od rednog broja konstante,
		 * metoda compareTo() vraća pozitivan broj.*/

		Boja b1, b2, b3;

		b1 = Boja.Crvena;
		b2 = Boja.Plava;
		b3 = Boja.Zelena;
		Boja b4 = Boja.Šućmurasta;
		Boja b5 = Boja.Šućmurasta;
		Boja b6 = Boja.Crvena;

		if (b1.compareTo(b2) < 0)
			System.out.println("\033[1;91m" + b1 + "\033[0m dolazi pre " + "\033[1;34m" + b2 + "\033[0m");

		if (b2.compareTo(b3) > 0)
			System.out.println("\033[1;34m" + b2 + "\033[0m dolazi posle " + "\033[1;92m" + b3 + "\033[0m");

		if (b1.compareTo(b6) == 0)
			System.out.println("\033[1;91m" + b1 + "\033[0m jednako " + "\033[1;91m" + b6 + "\033[0m");

		/*
		 * equals() - metoda poredi jednakost konstante iz nabrajanja sa svakim drugim objektom.
		 */

		if (b1.equals(b2))
			System.out.println("Greška!!!");
		else
			System.out.println("\033[1;91m" + b1 + "\033[0m nije isto što i " + "\033[1;34m" + b2 + "\033[0m");

		if (b4.equals(b5))
			System.out.println(b4 + " jednako " + b5);

		if (b1 == b6)
			System.out.println("\033[1;91m" + b1 + "\033[0m == " + "\033[1;91m" + b6 + "\033[0m");

	}

}
