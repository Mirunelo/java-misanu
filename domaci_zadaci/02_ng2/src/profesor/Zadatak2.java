package profesor;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Uneti trocifreni broj: ");
		int broj = input.nextInt();
		
		int stotica = broj / 100;
		int desetica = (broj % 100) / 10;
		int jedinica = (broj % 100) % 10;
		int proizvod = stotica * desetica * jedinica;
		int suma = (int) (Math.pow(stotica, 3) + Math.pow(desetica, 3) + Math.pow(jedinica, 3));
		int noviBroj = 100 * jedinica + 10 * desetica + stotica;
		
		System.out.println("Proizvod: " + proizvod);
		System.out.println("Suma kubova: " + suma);
		System.out.println("Novi broj: " + noviBroj);
		
		input.close();
	}

}
