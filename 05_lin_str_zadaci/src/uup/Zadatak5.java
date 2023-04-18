package uup;
import java.io.*;
public class Zadatak5 {

	public static void main(String[] args) throws Exception {

		// n - trocifren broj
		// s - cifra stotice
		// d - cifra desetice
		// j - cifra jedinice
		// zbir - zbir cifara trocifrenog broja
		
		int n, s, d, j, zbir;
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		
		// Unos trocifrenog broja
		System.out.print("Unesite trocifren broj n: ");
		n = Integer.parseInt(ulaz.readLine());
/*		
		// Nalazenje cifara trocifrenog broja
		s = n / 100;
		d = (n - s * 100) / 10;
		j = n - s * 100 - d * 10;
*/
		s = n / 100;
		d = (n % 100) / 10;
		j = n % 10;
		
		// Izracunavanje zbira cifara trocifrenog broja
		zbir = s + d + j;
		
		// Stampanje rezultata
		System.out.println("Zbir cifara trocifrenog broja " + n + " je " + zbir);
	}

}
