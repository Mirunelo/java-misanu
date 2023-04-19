package UUP;

import java.io.*;
public class Buffer {

	public static void main(String[] args) throws Exception {
		double x;
		//Unos podataka
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Unesite realan broj: ");
		x = Double.parseDouble(ulaz.readLine());
		System.out.println("Uneli ste vrednost " + x + ".");
	}

}
