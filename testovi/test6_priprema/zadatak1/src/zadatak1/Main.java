package zadatak1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);
		int n = 0;
		int r = (int) (Math.random()*10);
		int broj = -1;
		do {
			n++;
			System.out.println("Unesite broj:");
			broj = ulaz.nextInt();
			if (broj > r)
				System.out.println("Traženi broj je manji od unetog broja...\n\nfalse");
			else if(broj < r)
				System.out.println("Traženi broj je veći od unetog broja...\n\nfalse");
		}while(broj != r);
		System.out.println("Pogodili ste traženi broj. To je broj: " + r + ". Pogodili ste iz " + n + ". pokušaja.true");
		
		ulaz.close();
		
	}

}
