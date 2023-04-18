package UUP;

import java.util.Scanner;

public class ScannerClassExample1 {

	public static void main(String[] args) {

		String s = "Zdravo, ovo je JavaTpoint.";
		// Kreiramo scanner Object i smeštamo string u njega
		Scanner scan = new Scanner(s);
		// Proveravamo da li scanner ima token
		System.out.println("Boolean Rezultat: " + scan.hasNext());
		// Štampamo string
		System.out.println("String: " + scan.nextLine());
		scan.close();
		System.out.println("-------Unesite vaše podatke-------");
		Scanner in = new Scanner(System.in);
		System.out.print("Unesite ime i prezime: ");
		String name = in.nextLine();
		System.out.println("Vaše ime i prezime glasi: " + name);
		System.out.print("Koliko imate godina? ");
		int i = in.nextInt();
		System.out.println("Vi imate: " + i + " godina.");
		System.out.print("Koliko iznosi vaša prosečna plata? ");
		double d = in.nextDouble();
		System.out.println("Vaša prosečna plata iznosi: " + d);
		in.close();
		
	}

}
