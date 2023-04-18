package uup;
import java.io.*;
public class Zadatak6 {

	public static void main(String[] args) throws Exception {

		// n - dijagonala ekrana izražena u inčima
		double n;
		
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		
		// Unos dijagonale ekrana izražene u inčima
		System.out.print("Unesite dijagonalu ekrana u inčima: ");
		n = Double.parseDouble(ulaz.readLine());
		
		// Štampanje rezultata
		System.out.println("Dijagonala ekrana izražena u centimetrima " + n * 2.54);
		
	}

}
