package vezba;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Zadatak_03 {

	public static void main(String[] args) {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		boolean test = true;
		double x = 0;
		while (test) {
			try {
				System.out.print("Unesite realnu vrednost za promenljivu x: ");
				x = Double.parseDouble(bf.readLine());
				test = false;
			} catch (Exception e) {
				test = true;
			}
		}

		double y;
		if (x < 5)
			y = Math.pow(x - 3, 2);
		else if (x >= 8)
			y = x - 1;
		else
			y = x + 2;

		System.out.println("\nZa unesenu vrednost x, prema uslovu zadatka\ny(x) = " + y);

	}

}
