package canak.mirko;

import java.util.Scanner;

public class Zadatak2IfElse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite kategoriju vozačke dozvole: ");
		char kategorija = sc.next().charAt(0);
		sc.close();
		
		if (kategorija == 'A'||kategorija == 'a')
		{
			System.out.println("Sa kategorijom " + kategorija + " možete voziti motocikl.");
		}
		else if (kategorija == 'B'||kategorija == 'b')
		{
			System.out.println("Sa kategorijom " + kategorija + " možete voziti automobil.");
		}
		else if (kategorija == 'C'||kategorija == 'c')
		{
			System.out.println("Sa kategorijom " + kategorija + " možete voziti automobil i kamion.");
		}
		else if (kategorija == 'D'||kategorija == 'd')
		{
			System.out.println("Sa kategorijom " + kategorija + " možete voziti autobus.");
		}
		else if (kategorija == 'E'||kategorija == 'e')
		{
			System.out.println("Sa kategorijom " + kategorija + " možete voziti automobil, kamion i kamion sa prikolicom.");
		}
		else
		{
			System.out.println("Pogrešno ste uneli kategoriju vozačke dozvole!");
		}
	}

}
