package canak.mirko;

import java.util.Scanner;

public class ElseIf4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite kvadrant: 1, 2, 3 ili 4");
		byte kvadrant = sc.nextByte();

		sc.close();

		if (kvadrant == 1) {
			System.out.println("kvadrant " + kvadrant + " ide od 0° do 90°\nx > 0\ny > 0");
		} else if (kvadrant == 2) {
			System.out.println("kvadrant " + kvadrant + " ide od 90° do 180°\nx < 0\ny > 0");
		} else if (kvadrant == 3) {
			System.out.println("kvadrant " + kvadrant + " ide od 180° do 270°\nx < 0\ny < 0");
		} else if (kvadrant == 4) {
			System.out.println("kvadrant " + kvadrant + " ide od 270° do 360°\nx > 0\ny < 0");
		} else {
			System.out.println("Pogrešno ste uneli kvadrant!");
		}

	}

}
