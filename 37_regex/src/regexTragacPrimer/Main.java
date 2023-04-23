// Karakteri:
// XY ili abc -> XY ili abc
// . -> bilo koji jedan karakter
// [] -> bilo koji jedan karakter iz skupa ponuđenih [abc] -> a, b ili c, ali ne aa, ab, bc, z...
// - -> rang [a-z0-9] bilo koji jedan karakter od a do z ili od 0 do 9
// ^ -> ^abc odgovara String-u koji počinje abc; [^abc] je jedan karakter koji nije a, b ili c
// $ -> com$ znači da String mora da se završi sa com, NPR www.google.com, ali ne i comunist!

// Kvantifikatori:
// ? -> @? znači da se @ može i ne mora naći u tekstu
// * -> [0-9]* svaki broj od 0 do 9 se može ponoviti u tekstu bezbroj puta
// + -> [a-z]+ sva mala slova od a do z mogu se pojaviti jednom ili više puta abbc, ali ne a2, aA...
// {n} -> [a-z]{3} sva mala slova od a do z mogu se ponavljati, ali samo 3 karaktera su dozvoljena
// {m,n} -> [a-z]{2,6} znači da se slova od a do z mogu ponavljati, ali br karaktera od 2 do 6

// Meta Karakteri:
// \s -> Karakter poput razmaka, nove linije ili tab-a
// \d -> Radi poput [0-9]
// \w -> Radi poput [a-zA-Z_0-9]+
// \b -> Granice reči, kao na početku ili na kraju reči.
// \S \D \W \B -> su negacije gore pomenutog (nije razmak..., nije broj, nije reč...)

package regexTragacPrimer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			System.out.println("Unesite regex matricu:");
			Pattern matrica = Pattern.compile(ulaz.readLine());
			System.out.println("Unesite tekst za pretragu:");
			Matcher test = matrica.matcher(ulaz.readLine());
			boolean nasao = false;
			while (test.find()) {
				if (test.group() != "")
					System.out.println("Našao sam tekst " + test.group() + " počevši od indeksa " + test.start()
							+ " zaključno sa indeksom " + test.end());
				nasao = true;
			}
			if (!nasao) {
				System.out.println("Nema poklapanja.");
			}
		}

	}

}
