package canak.mirko;

import java.util.Scanner;

public class ElseIf5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double ce;
		
		System.out.print("Unesite kapacitet prvog kondenzatora u nF: ");
		double c1 = sc.nextDouble();
		System.out.print("Unesite kapacitet drugog kondenzatora u nF: ");
		double c2 = sc.nextDouble();
		System.out.println("Da li su kondenzatori vezani\na) Redno\nb) Paralelno\n(unesite a ili b)");
		char veza = sc.next().charAt(0);
		
		sc.close();
		
		if (veza=='a'||veza=='A') {
			ce = c1*c2/(c1+c2);
			System.out.println("\nEkvivalentni kapacitet redne veze Ce = " + ce + " nF.");
		}
		else if (veza=='b'||veza=='B') {
			ce = c1 + c2;
			System.out.println("\nEkvivalentni kapacitet paralelne veze Ce = " + ce + " nF.");
		}
		else
			System.out.println("\nMorate uneti 'a' za rednu ili 'b' za paralelnu vezu kondenzatora!");
		
	}

}
