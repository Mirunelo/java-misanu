package uup_Zadatak_08;

import java.io.*;

public class TestStudent {

	public static void main(String[] args) throws Exception {

		/* Deklarisanje podataka */
		String imePrezime;
		int brojIndeksa;
		double prosecnaOcena;

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		try {
			/* Unos podataka o studentu */
			System.out.print("Unesite ime i prezime studenta: ");
			imePrezime = ulaz.readLine();
			System.out.print("Unesite broj indeksa studenta: ");
			brojIndeksa = Integer.parseInt(ulaz.readLine());
			System.out.print("Unesite prosečnu ocenu studenta: ");
			prosecnaOcena = Double.parseDouble(ulaz.readLine());

			/* Kreiranje objekta klase Student */
			Student s = new Student();

			/* Postavljanje podataka o studentu */
			s.setImePrezime(imePrezime);
			s.setBrojIndeksa(brojIndeksa);
			s.setProsecnaOcena(prosecnaOcena);

			/* Štampanje podataka o studentu */
			System.out.println("\nPodaci o studentu su: ");
			System.out.println("Ime i prezime: " + s.getImePrezime() + "\nBroj indeksa: " + s.getBrojIndeksa()
					+ "\nProsecna ocena: " + s.getProsecnaOcena());
		} catch (Throwable e) {
			/* Štampanje informacije o izuzetku metodom printStackTrace */
			System.out.println("Štampanje informacije o izuzetku metodom printStackTrace");
			e.printStackTrace();

			/* Kreiranje stack trace-a */
			StackTraceElement stack[] = e.getStackTrace();

			/* Unos elemenata */
			for (int i = 0; i < stack.length; i++) {
				String fileName = stack[i].getFileName();
				String className = stack[i].getClassName();
				String methodName = stack[i].getMethodName();
				boolean isNativeMethod = stack[i].isNativeMethod();
				int line = stack[i].getLineNumber();
			}

			/* Štampanje informacije o izuzetku iz stack trace-a */
			System.out.println("\nŠtampanje informacije o izuzetku iz stack trace-a");
			for (int i = 0; i < stack.length; i++)
				System.out.println(stack[i]);
		}
	}
}