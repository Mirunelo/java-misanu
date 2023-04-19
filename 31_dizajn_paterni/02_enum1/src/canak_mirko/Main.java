package canak_mirko;

/* Nabrajanje je lista imenovanih vrednosti koje definišu nov tip podataka
 * i njegove dozvoljene vrednosti. To znači da nabrajanje može da sadrži
 * samo neku od vrednosti koje su navedene na listi.
 */

public class Main {

	public static void main(String[] args) {

		Boje b; // analogiju pravimo na int a;
		
		b = Boje.Crvena; // a = 5; inicijalizacija kao za int itd...
		
		System.out.println("Boja: " + b);
		
		b = Boje.Plava;
		if ( b == Boje.Plava )
			System.out.println("Plava");
		
		switch(b) {
		case Crvena:
			System.out.println("Crvena.");
			break;
		case Zelena:
			System.out.println("Zelena.");
			break;
		case Plava:
			System.out.println("Plava.");
			break;
		case Crna:
			System.out.println("Crna.");
			break;
		case Bela:
			System.out.println("Bela.");
			break;
		case Narandzasta:
			System.out.println("Narandžasta.");
			break;
		case Zuta:
			System.out.println("Žuta.");
		}
		
	}

}
