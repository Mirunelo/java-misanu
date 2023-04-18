package vezba;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite promenljivu x: ");
		double x = sc.nextDouble();
		double y;

		if (x > -2 && x <= 2)
			y = 2 * x;
		else if (x >= 5 && x < 7)
			y = 3 * x - 1;
		else
			y = 1 / x;

		System.out.println("Vrednost funkcije y= " + y);

		sc.close();

	}

}
