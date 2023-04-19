package zadatak_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite ceo broj veći ili jednak 2: ");
		int broj = sc.nextInt();
		
		switch(broj) {
		case 2:
			System.out.println("Broj " + broj + " je prost broj.");
			break;
		case 3:
			System.out.println("Broj " + broj + " je prost broj.");
			break;
		default:
			for(int i = 2; i <= broj/2; i++)
				if(broj%i==0) {
					System.out.println("Broj " + broj + " nije prost broj.");
					break;
				}
				else if(i>=broj/2) {
					System.out.println("Broj " + broj + " je prost broj.");
					break;
				}
				else
					continue;
		}
		
		sc.close();
		
	}

}
