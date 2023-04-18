package canak.mirko;
import java.io.*;
import java.text.*;
public class Primer6 { public static void main(String[] args) throws Exception {
	DecimalFormat df = new DecimalFormat("#.###");
	BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
	
	// Inicijalizacija promenljive s
	
	double s = 0;
	
	// Unos vrednosti promenljive n
	
	System.out.print("Unesite vrednost za n: ");
	int n = Integer.parseInt(ulaz.readLine());
	
	// Izračunavanje vrednosti sume
	
	for (int i = 1; i <= n; i++)
		s = Math.sqrt(6 + s);
	
	// Štampanje izlaznog rezultata
	
	System.out.println("Dobijena vrednost sume je " + df.format(s));
	} 
}