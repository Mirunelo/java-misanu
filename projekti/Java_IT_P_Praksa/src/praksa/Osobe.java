package praksa;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Osobe {

	private ArrayList<String> imena;
	private ArrayList<String> prezimena;
	private ArrayList<String> house;
	private ArrayList<String> datoteka;

	public Osobe() {
		imena = new ArrayList<>();
		prezimena = new ArrayList<>();
		house = new ArrayList<>();
		datoteka = new ArrayList<>();
		lista();
	}

	// Klasa se poziva pri pravljenju objekta klase Osobe
	// Izdvaja sve podatke o osobama iz datoteke
	private void lista() {
		String text;
		text = FileHelper.loadMetaData();
		Pattern recSeparator = Pattern.compile("[,\\s]+");
		String[] reci = recSeparator.split(text);
		for (int i = 3; i < reci.length; i = i + 5) {
			imena.add(reci[i]);
			prezimena.add(reci[i + 1]);
			house.add(reci[i + 2] + " " + reci[i + 3]);
			datoteka.add(reci[i + 4]);
		}

	}

	// Štampa sve poruke za osobu zadatog ime-na
	public void stampajPoruke(String ime) {
		int i = imena.indexOf(ime);
		System.out.println("Štampamo sve poruke osobe " + imena.get(i) + ":\n");
		List<String> chat = FileHelper.loadMessages(datoteka.get(i));
		for (i = 1; i < chat.size(); i++)
			System.out.println(chat.get(i));
	}

	// Štampa br. poruka koje je poslala svaka osoba
	public void brPorukaSvihOsoba() {
		System.out.println("Broj poruka koje je svaka osoba poslala:\n");
		for (int i = 0; i < datoteka.size(); i++) {
			List<String> chat = FileHelper.loadMessages(datoteka.get(i));
			System.out.println("Osoba " + imena.get(i) + " je poslala " + (chat.size() - 1) + " poruka.");
		}
	}

	// Kompletna analiza upotrebe Happy/Sad smajlija
	public void sadOrHappy() {
		ArrayList<Integer> sadDispozicija = new ArrayList<>();
		System.out.println("Analiza osoba prema upotrebi smajlija:\n");
		Pattern happy = Pattern.compile("[😄🙂😊😍]");
		Pattern sad = Pattern.compile("[😢😭😞👿]");
		for (int i = 0; i < datoteka.size(); i++) {
			List<String> chat = FileHelper.loadMessages(datoteka.get(i));
			Matcher testHappy = happy.matcher(chat.toString());
			Matcher testSad = sad.matcher(chat.toString());
			int s = 0;
			int h = 0;
			while (testHappy.find()) {
				if (testHappy.group() != "")
					h++;
			}
			while (testSad.find()) {
				if (testSad.group() != "")
					s++;
			}
			sadDispozicija.add(s);
			sadDispozicija.add(h);
			if (s > h)
				System.out.println("Osoba " + imena.get(i) + " je upotrebila " + s + " tužnih i " + h + " srećnih smajlija, pa je zaključak da je više tužna.");
			else if (s < h)
				System.out.println("Osoba " + imena.get(i) + " je upotrebila " + s + " tužnih i " + h + " srećnih smajlija, pa je zaključak da je više srećna.");
			else
				System.out.println("Osoba " + imena.get(i) + " je upotrebila " + s + " tužnih i " + h + " srećnih smajlija, pa je zaključak da je podjednako i srećna i tužna.");
		}
		int s = 0;
		int h = 0;
		for (int i = 0; i < sadDispozicija.size(); i += 2) {
			s += (int) sadDispozicija.get(i);
			h += (int) sadDispozicija.get(i + 1);
		}
		System.out.println();
		if (s > h)
			System.out.println("Chat-ovi generalno imaju negativnu dispoziciju, tj. više je tužnih " + s + " nego srećnih " + h + " smajlija.");
		else if (s < h)
			System.out.println("Chat-ovi generalno imaju pozitivnu dispoziciju, tj. više je srećnih " + h + " nego tužnih " + s + " smajlija.");
		else
			System.out.println(
					"Chat-ovi generalno imaju neutralnu dispoziciju, tj. isti je broj tužnih " + s + " i srećnih " + h + " smajlija.");
		int min = sadDispozicija.get(0) - sadDispozicija.get(1);
		int max = min;
		int razlika;
		String najtuznija = null;
		String najsrecnija = null;
		for (int i = 0; i < sadDispozicija.size(); i += 2) {
			razlika = sadDispozicija.get(i) - sadDispozicija.get(i + 1);
			if (max <= razlika) {
				max = razlika;
				najtuznija = imena.get(i / 2);
			}
			if (min >= razlika) {
				min = razlika;
				najsrecnija = imena.get(i / 2);
			}
		}
		System.out.println("\n5. Osobe sa najpozitivnijom i najnegativnijom dispozicijom:\n");
		System.out.println("Osoba " + najsrecnija + " ima najpozitivniju dispoziciju, tj. najsrećnija je.");
		System.out.println("Osoba " + najtuznija + " ima najnegativniju dispoziciju, tj. najtužnija je.");
	}

	// Analiza Loving smajlija
	public void odmeriLjubav(String ime1, String ime2) {
		// Saznajemo indekse Osoba prema njihovom imenu
		int x = imena.indexOf(ime1);
		int y = imena.indexOf(ime2);
		
		// Zadajemo pattern za ljubavne smajlije
		Pattern loving = Pattern.compile("[😍😘]");
		
		// Test ljubavi osobe ime1:
		// Učitavamo List-u četa
		List<String> chat1 = FileHelper.loadMessages(datoteka.get(x));
		// Uklanjamo sve linije četa u kojima se ne obraća osobi ime2
		System.out.println("Uklanjamo linije chat-a u kojima se " + ime1 + " ne obraća " + ime2);
		for(int i = 0; i < chat1.size(); i++)
			if(!chat1.get(i).startsWith(ime2)) {
				System.out.println(". \033[1;91mLinija " + i + " uklonjena -> " + chat1.get(i) + "\033[0m");
				chat1.remove(i);
				i--;
			}
		// Sumiramo broj ljubavnih smajlija osobe ime1 upućene osobi ime2
		Matcher testLoving1 = loving.matcher(chat1.toString());
		int n = 0;
		while (testLoving1.find())
			if (testLoving1.group() != "")
				n++;
		
		// Test ljubavi osobe ime2
		// Učitavamo List-u četa
		List<String> chat2 = FileHelper.loadMessages(datoteka.get(y));
		// Uklanjamo sve linije četa u kojima se ne obraća osobi ime2
		System.out.println("\nUklanjamo linije chat-a u kojima se " + ime2 + " ne obraća " + ime1);
		for(int i = 0; i < chat2.size(); i++)
			if(!chat2.get(i).startsWith(ime1)) {
				System.out.println(". \033[1;91mLinija " + i + " uklonjena -> " + chat2.get(i) + "\033[0m");
				chat2.remove(i);
				i--;
			}
		// Sumiramo broj ljubavnih smajlija osobe ime2 upućene osobi ime1
		Matcher testLoving2 = loving.matcher(chat2.toString());
		int m = 0;
		while (testLoving2.find())
			if (testLoving2.group() != "")
				m++;
		
		// Štampamo zaključak
		System.out.print("\nAnalizom ljubavnih smajlija:\n" + imena.get(x) + " -> " + n + "\n" + imena.get(y) + " -> " + m + "\nutvrđeno je da ");
		if(n > m)
			System.out.println(imena.get(x) + " više voli " + imena.get(y) + ".");
		else if(n < m)
			System.out.println(imena.get(y) + " više voli " + imena.get(x) + ".");
		else
			System.out.println("se " + imena.get(x) + " i " + imena.get(y) + " vole istim intenzitetom.");
	}
	
	// Štampa tabelarni prikaz svih osoba
	public void listaPodataka() {
		System.out.println("______________________________________________________________________________");
		System.out.println("|     Ime     |   Prezime   |      Odanost      |       Datoteka chat-a      |");
		System.out.println("|-------------|-------------|-------------------|----------------------------|");
		for (int i = 0; i < imena.size(); i++) {
			System.out.print(String.format("| %-12s", imena.get(i)));
			System.out.print(String.format("| %-12s", prezimena.get(i)));
			System.out.print(String.format("| %-18s", house.get(i)));
			System.out.print(String.format("| %-27s", datoteka.get(i)) + "|");
			if (i < imena.size() - 1)
				System.out.println("\n|-------------|-------------|-------------------|----------------------------|");
			else
				System.out.println("\n|_____________|_____________|___________________|____________________________|");
		}
	}
}
