package uup;
import java.util.Scanner;
public class Vezba5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite promenljivu a: ");
		double a = input.nextDouble();
		
		System.out.print("Unesite promenljivu b: ");
		double b = input.nextDouble();
		
		System.out.print("Unesite promenljivu c: ");
		double c = input.nextDouble();
		
		double l = 1/(b+c)*Math.sqrt(b*c*( Math.pow((b+c),2) - Math.pow(a, 2)));
		
		double la = Math.sqrt(b*c*(Math.pow(b+c,2) - a * a)) / (b+c);
		
		System.out.println("Dužina simetrale ugla iz temena A je: " + l);
		System.out.println("Dužina simetrale ugla iz temena A je: " + la);
		
		input.close();
		
		// Nije gotovo.
	}

}
