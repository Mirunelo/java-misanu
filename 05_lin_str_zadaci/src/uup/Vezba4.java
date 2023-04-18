package uup;

import java.util.Scanner;

public class Vezba4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite ugao u stepenima: ");
		int step = sc.nextInt();
		System.out.println("Ugao " + step + " stepeni pretvoren u radijane je: " + Math.toRadians(step));
		sc.close();
		System.out.println("Najmanji ceo broj: " + Math.floor(Math.toRadians(step)));
		System.out.println("Količnik deljenja: 15/2 = " + Math.floorDiv(15, 2));
		System.out.println("Ostatak deljenja: 15/2 = " + Math.floorMod(15, 2));
		System.out.println("15%2 = " + 15%2);
		
	}

}
