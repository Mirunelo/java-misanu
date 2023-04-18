package uup;

import java.util.Scanner;

public class Trougao {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		
		System.out.println("Unesite stranice trougla a, b, c");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double O = a + b + c;
		System.out.println("Obim trougla je " + O);
		double s = O / 2;
		double P = Math.sqrt(s * (s - a) * (s - b) * (s - c));
		System.out.print("Površina trougla je " + P);
		
		input.close();
	}

}
