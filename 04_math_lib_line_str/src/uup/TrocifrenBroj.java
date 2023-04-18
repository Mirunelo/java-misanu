package uup;

import java.util.Scanner;

public class TrocifrenBroj {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Trocifren broj:");
		int broj = input.nextInt();
		
		int s, d, j;
		
		s = broj / 100;			// cifra stotica
		d = (broj / 10) % 10;	// cifra desetica
		j = broj % 10;			// cifra jedinica
		
		System.out.println("broj = " + broj + ", cifra stotina = " + s + ", cifra desetica = " + d + ", cifra jedinica = " + j);	
		
		input.close();
		
	}

}
