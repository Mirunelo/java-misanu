package zadatak_04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws Exception {

		List<String> listing = new ArrayList<String>();

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Unosite proizvoljne koještarije.\nKad poželite da prekinete unos, unesite -1.");

		System.out.println();
		boolean test = true;
		while (test) {
			System.out.print("Unos sa tastature: ");
			String kojesta = ulaz.readLine();
			if (kojesta.equals("-1"))
				test = false;
			else
				listing.add(kojesta);
		}

		System.out.println("\nŠtampanje unete kolekcije elemenata:");
		for (String element : listing)
			System.out.print(element + " ");

	}

}
