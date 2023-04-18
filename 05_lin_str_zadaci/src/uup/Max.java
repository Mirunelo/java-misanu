package uup;

import java.util.Scanner;

public class Max {
	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	
	System.out.print("Unesite vrednost za a: ");
	double a = input.nextDouble();
	System.out.print("Unesite vrednost za b: ");
	double b = input.nextDouble();
	
	System.out.println("y = " + (5 + Math.max(a * a, b * b)));
	input.close();
	}
}