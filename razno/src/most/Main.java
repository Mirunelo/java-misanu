package most;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite nosivost mosta: ");
		double most = sc.nextDouble();
		System.out.print("Unesite težinu vozila: ");
		double t = sc.nextDouble();
		char oznaka = '0';
		double utv;
		boolean test = true;
		while(test) {
			System.out.print("Unesite jednoslovnu oznaku vozila P ili T: ");
			oznaka = sc.next().charAt(0);
			if (oznaka == 'P'||oznaka == 'p'||oznaka =='T'||oznaka =='t')
				test = false;
		}
		
		switch(oznaka) {
		case 'T':
		case 't':
			System.out.print("Unesite težinu tereta: ");
			double teret = sc.nextDouble();
			Vozilo t1 = new Teretno(teret);
			t1.setT(t);
			System.out.println();
			System.out.println(t1.opis());
			utv = t1.ukupnaTeznaVozila();
			testMosta(most,utv);
			break;
		
		case 'P', 'p':
			System.out.print("Unesite broj putnika: ");
			int brPutnika = sc.nextInt();
			System.out.println("Unesite prosečnu težinu putnika: ");
			double prosecnaTezina = sc.nextDouble();
			Vozilo p1 = new Putnicko(brPutnika, prosecnaTezina);
			p1.setT(t);
			System.out.println();
			System.out.println(p1.opis());
			utv = p1.ukupnaTeznaVozila();
			testMosta(most, utv);
			break;
		}
		sc.close();
	}
	public static void testMosta(double t, double ut){
		if ( t > ut)
			System.out.println("Zadato vozilo ukupne težine " + ut + " može preći most nosivosti " + t);
		else
			System.out.println("Zadato vozilo ukupne težine " + ut + " ne može preći most nosivosti " + t);
	}

}
