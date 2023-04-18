package uup;

import java.io.*;
import java.text.DecimalFormat;

public class CelicniStap {

	public static void main(String[] args) throws Exception {

		// A – površina poprečnog preseka štapa
		// L - dužina štapa
		// E - modul elastičnosti materijala
		// deltaL - izduženje štapa
		// deltaA - kontrakcija
		// F - intenzitet aksijalne sile
		// mi - Poasonov koeficijent
		double A, L, E, deltaL, deltaA, F, mi;
		DecimalFormat df = new DecimalFormat("###,###.##");
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		
		// Unos podataka
		System.out.print("Unesite vrednost površine poprečnog preseka štapa A: ");
		A = Double.parseDouble(ulaz.readLine());
		System.out.print("Unesite vrednost dužine štapa L (cm): ");
		L = Double.parseDouble(ulaz.readLine());
		System.out.print("Unesite vrednost modula elastičnosti E: ");
		E = Double.parseDouble(ulaz.readLine());
		System.out.print("Unesite vrednost izduženja štapa (cm): ");
		deltaL = Double.parseDouble(ulaz.readLine());
		System.out.print("Unesite vrednost kontrakcije (cm): ");
		deltaA = Double.parseDouble(ulaz.readLine());
		
		// Izračunavanje vrednosti intenziteta aksijalne sile i Poasonovog koeficijenta
		F = A * E * deltaL / L;
		mi = L * deltaA / (A * deltaL);
		
		// Štampanje rezultata
		System.out.println("Intenzitet aksijalne sile je F = " + df.format(F) + "kN\nVrednost Poasonovog koeficijenta je " + df.format(mi));
		
	}

}
