package praksaNEW;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SmajliPomocnik {

	/* Metoda konverzacija za parametre:
	 * 1) Ime osobe 1;
	 * 2 )Ime osobe 2;
	 * 3) naziv datoteke chat-a osobe 1;
	 * 4) naziv datoteke chat-a osobe 2;
	 * 5) pattern za proveru,
	 * sumira upotrebu karaktera iz patterna koje su osobe koristile u međusobnoj
	 * konverzaciji i vraća tu sumu u obliku niza int[] xy = {osoba1, osoba2}*/
	public static int[] konverzacija(String ime1, String ime2, String dt1, String dt2, String pattern) {
		
		ArrayList<String> chat;
		
		// Test osobe ime1:
		// Zove metodu za filtriranje chat-a
		chat = privatnePoruke(ime1, ime2, dt1);
		// Zove metodu za brojanje karaktera zadatih patternom
		int n = brojacKaraktera(chat, pattern);
		
		// Test osobe ime2:
		chat = privatnePoruke(ime2, ime1, dt2);
		int m = brojacKaraktera(chat, pattern);

		// Vraća rezultat upotrebe ljubavnih smajlija za obe osobe
		int[] nm = {n, m};
		return nm;
	}
	
	// Metoda briše sve poruke koje osoba ime1 nije uputila osobi ime2
	public static ArrayList<String> privatnePoruke(String ime1, String ime2, String dt1) {

		// Učitava ArrayList-u chat-a
		ArrayList<String> chat = FileHelper.loadFiles("resource/message_logs/" + dt1);
		// Briše linije chat-a u kojima se osoba ime1 ne obraća osobi ime2
		System.out.println("Uklanjamo linije chat-a u kojima se " + ime1 + " ne obraća " + ime2);
		for (int i = 0; i < chat.size(); i++) {
			if (!chat.get(i).startsWith(ime2)) {
				System.out.println("\033[1;91mUklonjeno -> " + chat.get(i) + "\033[0m");
				chat.remove(i);
				i--;
			}
		}
		return chat;
	}

	// Metoda prebrojava karaktere zadate patternom u zadatom ArrayList chat-u
	public static int brojacKaraktera(ArrayList<String> chat, String pattern ) {
		// Kreira test pattern za zadati String pattern
		Pattern test = Pattern.compile(pattern);
		// Sumira karaktere iz patterna u zadatoj ArrayList-i chat-a
		Matcher tester = test.matcher(chat.toString());
		int suma = 0;
		while (tester.find())
			if (tester.group() != "")
				suma++;
		// Vraća rezultat
		return suma;
	}
}
