package uup;
import java.util.Scanner;
public class Vezba2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite logičku promenljivu x: ");
		boolean x = input.nextBoolean();
		
		System.out.print("Unesite logičku promenljivu y: ");
		boolean y = input.nextBoolean();
		
		boolean z = !(x||y) && !x || y;
		
		System.out.println("Vrednost funkcije je: " + z);
		
		input.close();
		
	}

}
