/* Regularni izrazi (regex) definišu matrice za pretragu stringova. Regex se koristi za
 * pretragu, editovanje i manipulaciju tekstom. Regex se koristi s leva na desno. Jednom
 * pronađeni karakteri se ne mogu koristiti u daljoj pretrazi. NPR: regex aba će pronaći
 * samo dva poklapanja u ababababa i to -> aba (b) aba (ba).
 * JAVA Regex API pruža 1 interfejs i 3 klase u java.util.regex paketu (MathcResult interfejs,
 * Matcher, Pattern i PatternSyntaxException Klasa).
 * 
 * Matcher Klasa implementira MatchResult interfejs. Koristi se da obezbedi operacije
 * provere poklapanja sekvence karaktera.
 * Pattern Klasa je kompajlirana verzija regularnih izraza. Koristi se za definisanje matrice
 * za regex mašinu.*/

package regularniIzrazi;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {

		// 1. način(korak po korak):
		System.out.println("Prvi način...");
		Pattern p = Pattern.compile(".s"); // . predstavlja neki karakter, a s je karakter s
		Matcher m = p.matcher("Ps"); // Ps je string za proveru
		boolean b1 = m.matches(); // true ukoliko ima poklapanja, inače false
		System.out.println("Da li se pattern .s poklapa sa Ps? -> " + b1);
		
		// 2. način(kombinovano):
		System.out.println("\nDrugi način...");
		boolean b2 = Pattern.compile(".s").matcher("Ps").matches();
		System.out.println("Da li se poklapa? -> " + b2);
		
		// 3. način (najprostije):
		System.out.println("\nTreći način...");
		boolean b3 = Pattern.matches(".s", "Ps");
		System.out.println("Da li se poklapa? -> " + b3);
	
		// Tražimo jedan bilo koji karakter i s, znači as, Ps, #s...
		System.out.println("\n.s == Ps -> " + Pattern.matches(".s", "Ps"));//true (drugi char je s)
		System.out.println(".s == mk -> " + Pattern.matches(".s", "mk"));//false (drugi char nije s)
		System.out.println(".s == mst -> " + Pattern.matches(".s", "mst"));//false (ima više od 2 karaktera)
		System.out.println(".s == amms -> " + Pattern.matches(".s", "amms"));//false (ima više od 2 karaktera)
		// Tražimo dva bilo koja karaktera i s, znači a$s je OK NPR...
		System.out.println("..s == mas -> " + Pattern.matches("..s", "mas"));//true (treći karakter je s)
		// Tražimo samo jedan karakter i to a, m ili n.
		System.out.println("[amn] == abcd -> " + Pattern.matches("[amn]", "abcd"));//false (true je a, m ili n)
		System.out.println("[amn] == a -> " + Pattern.matches("[amn]", "a"));//true (a jeste jedan od a, m, ili n karaktera)
		System.out.println("[amn] == ammmna -> " + Pattern.matches("[amn]", "ammmna"));//false (m i a se ponavljaju više puta)
		// Tražimo da se a, m ili n ponove samo jednom ili nijednom
		System.out.println("[amn]? == a -> " + Pattern.matches("[amn]?", "a"));//true (a, m ili n se ponavljaju samo jednom.)
		System.out.println("[amn]? == aaa -> " + Pattern.matches("[amn]?", "aaa"));//false (a se ponavlja više puta)
		System.out.println("[amn]? == aammmnn -> " + Pattern.matches("[amn]?", "aammmnn"));//false (a, m i n se ponavljaju više puta)
		System.out.println("[amn]? == aazzta -> " + Pattern.matches("[amn]?", "aazzta"));//false (a se ponavlja više puta)
		System.out.println("[amn]? == am -> " + Pattern.matches("[amn]?", "am"));//false (a, m ili n se moraju ponoviti samo jednom)
		// Tražimo da se a, m ili n ponavljaju jednom ili više puta
		System.out.println("[amn]+ == a -> " + Pattern.matches("[amn]+", "a"));//true (a se ponavlja jednom ili više puta)
		System.out.println("[amn]+ == aaa -> " + Pattern.matches("[amn]+", "aaa"));//true (a se ponavalja više puta)
		System.out.println("[amn]+ == aammmnn -> " + Pattern.matches("[amn]+", "aammmnn"));//true (a, m i n se ponavljaju jednom ili više puta)
		System.out.println("[amn]+ == aazzta -> " + Pattern.matches("[amn]+", "aazzta"));//false (z i t ne odgovaraju matrici za pretragu)
		System.out.println("[a-z]+ == agememnon -> " + Pattern.matches("[a-z]+", "agememnon"));//true (sve od a-z može se ponavaljati)
		// Tražimo da se a, m ili n ponove 0 ili više puta
		System.out.println("[amn]* == ammmna -> " + Pattern.matches("[amn]*", "ammmna"));//true (a, m ili n se ponavljaju 0 ili više puta)
		// Tražimo jedan broj
		System.out.println("\\d == aazzta -> " + Pattern.matches("\\d", "abc"));//false (nije broj)
		System.out.println("\\d == aazzta -> " + Pattern.matches("\\d", "1"));//true (broj i to jedan)
		System.out.println("\\d == aazzta -> " + Pattern.matches("\\d", "4443"));//false (brojevi ali više njih)
		System.out.println("\\d == aazzta -> " + Pattern.matches("\\d", "323abc"));//false (brojke i slova)
		// Tražimo jedan karakter koji nije broj
		System.out.println("\\D == abc -> " + Pattern.matches("\\D", "abc"));//false (nije broj, ali karaktera ima više od jedan)
		System.out.println("\\D == 1 -> " + Pattern.matches("\\D", "1"));//false (jedan broj)
		System.out.println("\\D == 4443 -> " + Pattern.matches("\\D", "4443"));//false (više brojeva)
		System.out.println("\\D == 323abc -> " + Pattern.matches("\\D", "323abc"));//false (brojke i slova)
		System.out.println("\\D == m -> " + Pattern.matches("\\D", "m"));//true (karakter nije broj i jedan je)
		// Tražimo karaktere koji nisu brojevi
		System.out.println("\\D* == maak -> " + Pattern.matches("\\D*", "maak"));//true (nisu brojevi i ponavljaju se jednom ili više puta)
		System.out.println("[0-9]* == maak -> " + Pattern.matches("[0-9]*", "maak"));//true (nisu brojevi i ponavljaju se jednom ili više puta)
		// Tražimo string od 6 karaktera koji se sastoji samo od slova i brojeva
		System.out.println("[a-zA-Z0-9]{6} == arun32 -> " + Pattern.matches("[a-zA-Z0-9]{6}", "arun32"));//true
		System.out.println("[a-zA-Z0-9]{6} == kkvarun32 -> " + Pattern.matches("[a-zA-Z0-9]{6}", "kkvarun32"));//false (više od 6 karaktera)
		System.out.println("[a-zA-Z0-9]{6} == JA2Uk2 -> " + Pattern.matches("[a-zA-Z0-9]{6}", "JA2Uk2"));//true
		System.out.println("[a-zA-Z0-9]{6} == arun$2 -> " + Pattern.matches("[a-zA-Z0-9]{6}", "arun$2"));//false ($ nije ni slovo ni broj)
		// Tražimo 10 cifreni broj koji počinje sa 7, 8 ili 9
		System.out.println("[789]\\d{9} == 9953038949 -> " + Pattern.matches("[789]\\d{9}", "9953038949"));//true
		System.out.println("[789][0-9]{9} == 7953038949 -> " + Pattern.matches("[789][0-9]{9}", "7953038949"));//true
		System.out.println("[789]\\d{9} == 99530389490 -> " + Pattern.matches("[789]\\d{9}", "99530389490"));//false (11 cifara)
		System.out.println("[789]\\d{9} == 6953038949 -> " + Pattern.matches("[789]\\d{9}", "6953038949"));//false ( ne počinje sa 7, 8 ili 9)
		System.out.println("[789]\\d{9} == 8853038949 -> " + Pattern.matches("[789]\\d{9}", "8853038949"));//true
		System.out.println("[789]{1}\\d{9} == 8853038949 -> " + Pattern.matches("[789]{1}\\d{9}", "8853038949"));//true
		System.out.println("[789]{1}\\d{9} == 3853038949 -> " + Pattern.matches("[789]{1}\\d{9}", "3853038949"));//false (ne počinje sa 7, 8 ili 9)
		System.out.println("^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,6}$ == mirun@ptt.rs -> " + Pattern.matches("^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,6}$", "mirun@ptt.rs"));//true
		System.out.println("^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,6}$ == john.smith(comment)@example.com -> " + Pattern.matches("^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,6}$", "pera/peric@example.com"));//true
		// Primer filtracije e-mail-a koji u potpunosti onemogućava grešku u Local-part delu, s tim što se mora uraditi dodatna provera za pojavu dve ili više tačaka spojeno što je takođe nedozvoljeno.
		System.out.println("^[a-zA-Z0-9!#$%&'*+/=?^_`{|}~-][a-zA-Z0-9!#$%&'*+/=?^_`{|}~.-]{0,62}[a-zA-Z0-9!#$%&'*+-/=?^_`{|}~]@[a-zA-Z0-9.-]+\\.[a-z]{2,6}$ == #!$%&'*+-/=?^_`{}|~@example.org -> " + Pattern.matches("^[a-zA-Z0-9!#$%&'*+/=?^_`{|}~-][a-zA-Z0-9!#$%&'*+/=?^_`{|}~.-]{0,62}[a-zA-Z0-9!#$%&'*+/=?^_`{|}~-]@[a-z0-9.-]+\\.[a-z]{2,6}$", "J#!$%&'*+-/=?^_`{}|~@example.org"));//false . ne može biti na početku i kraju Local-part dela e-mail adrese

		// Primer upotrebe Pattern.CASE_INSENSITIVE
		System.out.println("\nSledeće traži reč \"kursadžije\" ne obazirući se na velika i mala slova u tekstu:");
        String string = "Zdravo kursadžije, kako ste?\nKursadžije, naučićete mnogo od naših vrednih predavača.";
        System.out.println(string);

        Pattern pattern = Pattern.compile("kursadžije", Pattern.CASE_INSENSITIVE);

        Matcher match = pattern.matcher(string);

        System.out.println("Poklapanja:");
        while (match.find()) {
            System.out.println(match.group());
        }
        
        // Primer split() metode za dobijanje niza String-ova
        System.out.println("\nGornji tekst delimo na reči i štampamo niz tih reči");
        Pattern noviPattern = Pattern.compile("[.\\s]"); // tražimo tačku ili razmak, tab, novi red.
        System.out.println("koristeći se patternom: " + noviPattern.pattern());
        String[] splited = noviPattern.split(string); // punimo niz String-ova rečima iz teksta
        for(String str : splited)
        	System.out.print(" <" + str + "> ");
        
        // Primer upotrebe groupCount() metode za brojanje poklapanja
        String regex = "([A-Z])([0-9])"; // 3 grupe u regex-u (0-ta grupa je ceo regex, a ostale dve su razdvojene zagradama)
        String ulaz = "B92";
        Pattern noviPt = Pattern.compile(regex);
        MatchResult matcher = noviPt.matcher(ulaz);
        // Dobijamo rezultat 2 sa 0-tim baznim ideksom koji podrazumevano predstavlja ceo regex.
        System.out.println("\n\nU tekstu \"" + ulaz + "\" za pattern: " + regex + " imamo: " + matcher.groupCount() + " poklapanja.");
	}

}
