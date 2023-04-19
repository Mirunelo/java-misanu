package canakMirko;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {

		// Unos logičkih promenljivih
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Unesite logičke promenljive u formatu true ili false:");
		System.out.print("\nUnesite x: ");
		boolean x = scan.nextBoolean();
		System.out.print("Unesite y: ");
		boolean y = scan.nextBoolean();
		
		// Rešavanje funkcije
		boolean z = !(x|y)&!x|y;
		
		// Štampanje rezultata funkcije
		System.out.print("\nVrednost funkcije z za unete promenljive je " + z);
		
		scan.close();
	}

}
