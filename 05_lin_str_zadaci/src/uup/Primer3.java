package uup;

import java.util.Scanner;

public class Primer3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite vrednost za a: ");
		double a = input.nextDouble();
		System.out.print("Unesite vrednost za b: ");
		double b = input.nextDouble();
		
		double y = (1-Math.min(a, b))/(1+Math.max(a, b));
		System.out.println("y = " + y);
		input.close();
		
	}

}
