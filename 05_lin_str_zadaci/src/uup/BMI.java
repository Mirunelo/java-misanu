package uup;

import java.util.Scanner;
import java.text.DecimalFormat;

public class BMI {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.####");

		System.out.print("Unesite visinu: ");
		double h = input.nextDouble();
		System.out.print("Unesite masu: ");
		double m = input.nextDouble();
		
		double b = m / Math.pow(h, 2);
		
		System.out.println("Indeks telesne mase BMI = " + df.format (b));
		
		input.close();
	}

}
