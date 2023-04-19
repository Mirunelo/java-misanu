package canakMirko;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Zadatak5 {

	public static void main(String[] args) {

		// Unos stranica trougla a, b i c
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Unesite stranice trougla:\na = ");
		double a = scan.nextDouble();
		System.out.print("b = ");
		double b = scan.nextDouble();
		System.out.print("c = ");
		double c = scan.nextDouble();
		
		// Izračunavanje poluprečnika opisanog i upisanog kruga
		double s = (a+b+c)/2;
		double p = Math.sqrt( s*(s-a)*(s-b)*(s-c) );
		double ro = a*b*c/4/p;
		double ru = a*b*c/2/ro/s;
		
		// Štampanje rezultata
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println("\nVrednosti opisanog i upisanog kruga zadatog trougla iznose:");
		System.out.println("\nR = " + df.format(ro));
		System.out.println("r = " + df.format(ru));
		scan.close();
		
	}

}
