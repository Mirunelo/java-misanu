package zadatak_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Zadatak05 {

	private static List<String> unosPodataka(List<String> al) throws IOException {

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Unesite 10 imena:");
		for (int i = 0; i < 10; i++) {
			System.out.print((i + 1) + ". -> ");
			al.add(ulaz.readLine());
		}

		return al;

	}

	public static void main(String[] args) throws IOException {

		// a) kreiranje dinamičkog niza ArrayList
		List<String> al = new ArrayList<>();

		// b) Unutar niza dodajemo 10 imena, koristeći ugrađenu metodu
		unosPodataka(al);

		// c) ispisujemo sadržaj niza
		System.out.println("Lista imena:");
		System.out.println(al);

		/*
		 * d) Na poziciju 5 dodajemo ime Zlatko. Ako je pozicija 5, peto ime u našem
		 * dinamičkom nizu imena (ID 4), onda imamo:
		 */
		al.add(4, "Zlatko"); // večita dilema... da li je 5. element ili je element sa ID 5

		// e) ispisujemo sadržaj niza
		System.out.println("\nLista imena nakon što smo na petu poziciju dodali novo ime Zlatko:");
		System.out.println(al);
		
		// f) brišemo jedno ime... NPR treće ime u listi sa ID 2
		al.remove(2);
		
		// g) štampamo niz unapređenom for petljom za promenu
		System.out.println("\nLista imena nakon što smo obrisali treće ime:");
		for ( String s : al)
			System.out.print(s + "  ");

	}

}
