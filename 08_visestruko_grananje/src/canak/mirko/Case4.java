package canak.mirko;

import java.util.Scanner;

public class Case4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite kvadrant: 1, 2, 3 ili 4");
		byte kvadrant = sc.nextByte();

		sc.close();

		switch (kvadrant) {
		case 1: {
			System.out.println("kvadrant " + kvadrant + " ide od 0° do 90°\nx > 0\ny > 0");
			break;
		}
		case 2: {
			System.out.println("kvadrant " + kvadrant + " ide od 90° do 180°\nx < 0\ny > 0");
			break;
		}
		case 3: {
			System.out.println("kvadrant " + kvadrant + " ide od 180° do 270°\nx < 0\ny < 0");
			break;
		}
		case 4: {
			System.out.println("kvadrant " + kvadrant + " ide od 270° do 360°\nx > 0\ny < 0");
			break;
		}
		default:
			System.out.println("Pogrešno ste uneli kvadrant!");

		}
	}

}
