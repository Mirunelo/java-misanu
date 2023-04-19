package canak_mirko;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("ispis.txt");
		
		System.out.println("Sadržaj fajla: ");
		
		/* read() čita jedan po jedan bajt iz datoteke i vraća ga kao celobrojnu vrednost.
		 * Kada stigne do kraja metoda read() vraća vrednost -1.
		 */
		
		int ch;
		
		while((ch = fis.read()) != -1) {
			System.out.print((char)ch);
		}
		
		fis.close();
		
	}

}
