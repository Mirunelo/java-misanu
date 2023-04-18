package uup;
import java.util.Scanner;
public class Vezba3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite promenljivu a: ");
		double a = input.nextDouble();
		
		System.out.print("Unesite promenljivu b: ");
		double b = input.nextDouble();
		
		System.out.print("Unesite promenljivu c: ");
		double c = input.nextDouble();
		
		double f = (a-b)/(c+a/(c+(b/(c-b))));
		
		System.out.println("Funkcija f je: " + f);
		
		input.close();
		
		// Noje završeno... zbrzano
		
	}

}
