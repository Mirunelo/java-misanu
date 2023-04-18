package canak.mirko;

import java.text.*;

public class Proizvod { 
	public static void main(String[] args) {
	DecimalFormat df = new DecimalFormat("#.###");
	
	// Inicijalizacija promenljive p
	double p = 1;
	
	// Izračunavanje vrednosti proizvoda
		for (int n = 1; n <= 5; n++)
			p *= (n + 2.5) / (n * n + 1.2);
	
	// Štampanje izlaznog rezultata
	System.out.println("Dobijena vrednost proizvoda je " + df.format(p));
	} 
}