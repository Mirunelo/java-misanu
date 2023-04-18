package canak.mirko;
import java.io.*;
public class Primer17 {
	public static void main(String[] args) throws Exception{
		// Deklarisanje promenljivih x i y
		double x, y;
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 1; i <= 5; i++) {
			// Unos vrednosti promenljive x
			System.out.println("Unesite " + i + ". vrednost za x: ");
			x = Double.parseDouble(ulaz.readLine());
			// Razgranata struktura
			if (x < 2) y = x;
			else if (x < 3) y = 2.0;
			else y = x - 1;
			
			// Štampanje izlaznog rezultata
			System.out.println("Za uneto X = " + x + " dobija se Y = " + y);
		}
	}
}