package canak.mirko;

import java.util.Scanner;

public class Zadatak3Case {

	public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite kategoriju vozačke dozvole: ");
		char kategorija = sc.next().charAt(0);
		sc.close();
		
		switch(kategorija)
		{
		
		case 'a': case 'A':
		{
			System.out.println("\nSa kategorijom " + kategorija + " možete voziti motocikl.");
			break;
		}
		case 'b': case 'B':
		{
			System.out.println("\nSa kategorijom " + kategorija + " možete voziti automobil.");
			break;
		}
		case 'c': case 'C':
		{
			System.out.println("\nSa kategorijom " + kategorija + " možete voziti automobil i kamion.");
			break;
		}
		case 'd' , 'D':
		{
			System.out.println("\nSa kategorijom " + kategorija + " možete voziti automobil, kamion i autobus.");
			break;
		}
		case 'e' & 'E':
		{
			System.out.println("\nSa kategorijom " + kategorija + " možete voziti automobil, kamion i kamion sa prikolicom.");
			break;
		}
		default:
		{
			System.out.println("\nPogrešno ste uneli kategoriju vozačke dozvole!");
		}
		
		}
		
	}

}
