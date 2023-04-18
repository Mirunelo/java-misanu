package vezba;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite promenljivu x: ");
		int x = sc.nextInt();
		byte y;

		if (x < 0)
			y = -1;
		else if (x == 0)
			y = 0;
		else
			y = 1;

		System.out.println("Vrednost funkcije y= " + y);

		sc.close();

	}

}
