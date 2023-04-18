package canak.mirko;
import java.io.*;
import java.text.DecimalFormat;
public class Primer13b {
	public static void main(String[] args) throws Exception {
		DecimalFormat df = new DecimalFormat("#.######");
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		
		// Unos vrednosti promenljivih eps, x0 i y0
		System.out.print("Unesite vrednost za epsilon: ");
		double eps = Double. parseDouble(ulaz.readLine());
		System.out.print("Unesite vrednost za x0: ");
		double x0 = Double. parseDouble(ulaz.readLine());
		System.out.print("Unesite vrednost za y0: ");
		double y0 = Double. parseDouble(ulaz.readLine());
		
		// Iterativni postupak za određivanje rešenja sistema jednačina
		double x1 = 0.5 * Math.sqrt(x0 * (3 * y0 - 1) + 1);
		double y1 = Math.sqrt((x0 + 3) / 2);
		do {
			x0 = x1;
			x1 = 0.5 * Math.sqrt(x0 * (3 * y0 - 1) + 1);
			y0 = y1;
			y1 = Math.sqrt((x0 + 3) / 2);
			}
		while (Math.abs(x1 - x0) > eps || Math.abs(y1 - y0) > eps);
		
		//Štampanje izlaznog rezultata
		System.out.println("Rešenja sistema jednačina su x = " + df.format(x1) + " i y = " + df.format(y1));
	}
}