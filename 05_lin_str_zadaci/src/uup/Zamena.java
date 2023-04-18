package uup;

import java.util.Scanner;

public class Zamena {

	public static void main(String[] args) {

		int x, y;
		int temp;	// privremena promenljiva
		
		System.out.println("Dva broja: x y ");
		Scanner input = new Scanner(System.in);
		
		x = input.nextInt();
		y = input.nextInt();
		
		System.out.println("Pre zamene\nx = " + x + "\ny = " + y);
		
		temp = x;		// temp - privremena promenljiva
		x = y;		// x može primiti novu vrednost jer je kopija u temp
		y = temp;		// y prima vrednost od temp
		
		System.out.println("Posle zamene\nx = " + x + "\ny = " + y);
		
		input.close();
		
	}

}
