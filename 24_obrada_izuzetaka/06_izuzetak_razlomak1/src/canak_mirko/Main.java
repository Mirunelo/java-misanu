package canak_mirko;

/* java.uti.InputMismatchException; mora da se uveze */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	/* Metoda koja računa količnik */
	public static int kolicnik(int br, int im) {
		return br / im;
	}

	/* Glavni programski kod */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/* Inicijalizacija promenljivih */
		int brojilac = 0, imenilac = 0, rezultat;

		/*
		 * Prvi try/catch blok koji hvata pogrešan unos sa tastature Očekuje se unos
		 * celobrojnih vrednosti, a mi možemo greškom uneti realne vrednosti, stringove
		 * itd...
		 */
		try {
			System.out.print("Unesite brojilac razlomka: ");
			brojilac = sc.nextInt();
			//sc.reset();

			System.out.print("Unesite imenilac razlomka: ");
			imenilac = sc.nextInt();
			//sc.reset();
		} catch (InputMismatchException e) {
			System.out.println("Unesite celobrojne vrednosti! " + e);
			System.exit(0);
		}

		/* Drugi try/catch hvata u ovom slučaju deljenje nulom */
		try {
			rezultat = kolicnik(brojilac, imenilac);
			System.out.println("Količnik iznosi: " + rezultat);
		} catch (ArithmeticException e) {
			System.out.println("Izuzetak: " + e);

		}

		sc.close();

	}

}
