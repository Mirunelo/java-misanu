package canakMirko;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {

		// Unos stranice kvadrata
		Scanner scan = new Scanner(System.in);
		System.out.print("Unesite stranicu kvadrata a: ");
		double a = scan.nextDouble();
		
		// Računanje površine i obima kvadrata
		double p = Math.pow(a,2);
		double o = 4*a;
		
		// Štampanje rezultata
		System.out.println("\nPovršina i obim kvadrata stranice " + a + " iznose:\nP = " + p + "\nO = " + o);
		scan.close();
		
	}

}
