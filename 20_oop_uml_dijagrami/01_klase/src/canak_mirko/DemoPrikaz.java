package canak_mirko;

import java.io.*;

public class DemoPrikaz {

	public static void main(String[] args) throws Exception {
		
		/* Pešaka pravimo objekte i inicijalizujemo vrednosti promenljivih:
		Rastojanje r1 = new Rastojanje();
		Rastojanje r2 = new Rastojanje();
		Rastojanje r3 = new Rastojanje();
		
		r1.stopala = 14; //stopala i inci su atributi klase
		r1.inci = 9.5; // 9,5 se dodeljuje inci, objekta r1
		
		r2.stopala = 19;
		r2.inci = 5.5;
		
		// r3. će dobiti default vrednosti, tj. nule.
		
		System.out.println("Rastojanje 1: " + r1.stopala + "\' - " + r1.inci + "\"");
		System.out.println("Rastojanje 2: " + r2.stopala + "\' - " + r2.inci + "\"");
		System.out.println("Rastojanje 3: " + r3.stopala + "\' - " + r3.inci + "\"");
		*/
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Unesite broj objekata klase Rastojanje: ");
		int n = Integer.parseInt(bf.readLine());
		
		/* Deklarisanje niza objekata klase Rastojanje */
		Rastojanje[] r = new Rastojanje[n];
		Rastojanje[] k = new Rastojanje[n];
		
		int stopala;
		double inci;
		
		for ( int i = 0; i < n; i++ ) {
			System.out.print("Unesite elemente " + (i+1) + ". objekta:\nStopala: ");
			stopala = Integer.parseInt(bf.readLine());
			System.out.print("Inči: ");
			inci = Double.parseDouble(bf.readLine());
			/* r[i] = new Rastojanje(stopala, inci); - Unos preko konstruktora */
			
			/* Unos preko polja klase Rastojanje */
			r[i] = new Rastojanje(); /* Obavezno pravimo objekat! Gore smo samo deklarisali. */
			r[i].stopala = stopala;
			r[i].inci = inci;
			
			k[i] = new Rastojanje(stopala, inci);
			
		}
		
		for ( int i = 0; i < n; i++ ) {
			System.out.println( "Rastojanje r " + (i+1) + ": " + r[i].stopala + "\' - " + r[i].inci + "\"");
			System.out.println( "Rastojanje k " + (i+1) + ": " + k[i].stopala + "\' - " + k[i].inci + "\"");
		}
			
		
	}

}
