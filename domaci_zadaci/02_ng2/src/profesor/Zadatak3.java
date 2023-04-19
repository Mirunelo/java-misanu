package profesor;

import java.io.*;

public class Zadatak3 {

	public static void main(String[] args) throws Exception {

		// Deklarisanje promenljivih x i y
		double x, y;
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		// Unos vrednosti promenljive x
		System.out.print("Unesite vrednost za x: ");
		x = Double.parseDouble(ulaz.readLine());

		// Razgranata struktura
		if (x < 5)
			y = (x - 3) * (x - 3);
		else if (x < 8)
			y = x + 2;
		else
			y = x - 1;

		// Štampanje izlaznog rezultata
		System.out.println("Za uneto X = " + x + " dobija se Y = " + y);
	}

}
