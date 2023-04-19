package zadatak_05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		List<String> svastara = new LinkedList<String>();

		System.out.println("Unosite proizvoljne koještarije.\nKad poželite da prekinete unos, unesite -1.\n");

		while (true) {
			System.out.print("Unesite element u svaštaru: ");
			String tekst = bf.readLine();
			if (tekst.equals("-1"))
				break;
			else
				svastara.add(tekst);
		}

		System.out.println("\nŠtampanje vaše svaštare:\n");

		ListIterator<String> itera = svastara.listIterator();

		while (itera.hasNext())
			System.out.print(itera.next() + " ");

		System.out.println("\nŠtampanje kolekcije počev od zadnjeg elementa:\n");

		while (itera.hasPrevious())
			System.out.print(itera.previous() + " ");

	}

}
