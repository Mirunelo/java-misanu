package zadatak2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite red verižnog razlomka: ");
		int n = sc.nextInt();
		System.out.print("Unesite razlomak X/Y:\nbrojilac X: ");
		int x = sc.nextInt();
		System.out.print("imenilac Y: ");
		int y = sc. nextInt();
		
		VR ver = new VR(n, x, y);
		
		ver.verizniRazlomak();
		
		System.out.println(ver.opisRazlomka()); 
		
		sc.close();
		
	}

}
