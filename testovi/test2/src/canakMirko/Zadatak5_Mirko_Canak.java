package canakMirko;

import java.util.Scanner;

public class Zadatak5_Mirko_Canak {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite prvi broj: ");
		int b1 = sc.nextInt();
		System.out.println("Unesite drugi broj: ");
		int b2 = sc.nextInt();
		System.out.println("Unesite treći broj: ");
		int b3 = sc.nextInt();
		
		int max = b1;
		
		if (b2 > max)
			max = b2;
		
		if (b3 > max)
			max = b3;
					
		System.out.println("Najveći broj je: " + max);
		
		sc.close();
	}

}
