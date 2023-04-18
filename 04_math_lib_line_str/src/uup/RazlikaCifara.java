package uup;

import java.util.Scanner;

public class RazlikaCifara {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite dvocifren broj: ");
		int a = input.nextInt();
		System.out.println("Dvocifren broj: " + a);
		int d, j, r;
		d = a / 10;
		j = a % 10;
		r = d - j;
		
		System.out.println("Razlika cifara je: " + r);
		
		input.close();
		
	}

}
