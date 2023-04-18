package canak_mirko;

import java.util.Scanner;
import static java.lang.Math.PI;

public class Main {

	public static void main(String[] args) {

		double r, a;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite poluprečnik: ");
		r = sc.nextDouble();
		sc.close();
		a = PI * r * r;
		System.out.println("Površina kruga: " + a);
		
	}

}
