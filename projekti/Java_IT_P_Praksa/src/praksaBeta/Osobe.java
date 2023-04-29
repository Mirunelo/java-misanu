package praksaBeta;

import java.util.ArrayList;
import java.util.Collections;

public class Osobe implements GI{

	private ArrayList<String> imena;
	private ArrayList<String> prezimena;
	private ArrayList<String> odanosti;
	private ArrayList<String> datoteke;

	// Konstruktor
	public Osobe() {
		imena = new ArrayList<>();
		prezimena = new ArrayList<>();
		odanosti = new ArrayList<>();
		datoteke = new ArrayList<>();
		lista();
	}

	// Klasa se poziva pri pravljenju objekta klase Osobe
	// Izdvaja sve podatke o osobama iz datoteke
	private void lista() {
		ArrayList<String> metaData = FileHelper.loadFiles("resource/got_meta_data.txt");
		for (int i = 1; i < metaData.size(); i++) {
			// Deli podatke na: Osoba, Odanost, Datoteka poruka
			String[] split = metaData.get(i).split("[,]", 0);
			// Upisuje podatke u Kolekcije
			imena.add(split[0].split(" ")[0]); // Izdvaja i upisuje ime
			if(split[0].indexOf(' ') >= 0) // Uslov true -> Osoba ima prezime
				prezimena.add(split[0].split(" ")[1]); // Izdvaja i upisuje prezime
			else // Uslov false -> Kad osoba nema prezime
				prezimena.add("");
			odanosti.add(split[1].stripLeading()); // Briše whitespace-ove na početku Stringova
			datoteke.add(split[2].stripLeading()); // i upisuje odanost kući i ime datoteke
		}
	}

	// Štampa sve poruke za osobu zadatog ime-na
	public void stampajPoruke(String ime) {
		int i = imena.indexOf(ime);
		System.out.println("Štampamo sve poruke osobe " + imena.get(i) + ":\n");
		ArrayList<String> chat = FileHelper.loadFiles("resource/message_logs/" + datoteke.get(i));
		for (i = 1; i < chat.size(); i++)
			System.out.println(chat.get(i));
	}

	// Štampa broj poruka koje je poslala svaka osoba
	public void brPorukaSvihOsoba() {
		System.out.println("Broj poruka koje je svaka osoba poslala:\n");
		for (int i = 0; i < datoteke.size(); i++) {
			ArrayList<String> chat = FileHelper.loadFiles("resource/message_logs/" + datoteke.get(i));
			System.out.println("Osoba " + imena.get(i) + " je poslala " + (chat.size() - 1) + " poruka.");
		}
	}

	// Kompletna analiza upotrebe Srećnih/Tužnih smajlija
	public void srecanIliTuzan() {
		System.out.println("Analiza osoba prema upotrebi smajlija:\n");
		String[] izvestaji = new String[datoteke.size()];
		
		// ArrayList-a rezultata analize
		ArrayList<Integer> brojTuznih = new ArrayList<>();
		ArrayList<Integer> brojSrecnih = new ArrayList<>();
		
		// Dohvata tužne i srećne smajlije
		String sad = TipSmajlija.TUZNI.getSmajliji();
		String happy = TipSmajlija.SRECNI.getSmajliji();

		// Analizira sve datoteke poruka
		for (int i = 0; i < datoteke.size(); i++) {
			// Učitava listu chat-a
			ArrayList<String> chat = FileHelper.loadFiles("resource/message_logs/" + datoteke.get(i));

			// Poziva metodu za sumiranje karaktera
			int s = SmajliPomocnik.brojacKaraktera(chat, sad);
			int h = SmajliPomocnik.brojacKaraktera(chat, happy);

			// Upisuje rezultat u ArrayList rezultata analize
			brojTuznih.add(s);
			brojSrecnih.add(h);
			//System.out.println(max);
			
			// Štampa izveštaj dispozicije za osobu
			if (s > h)
				izvestaji[i] = "Osoba " + imena.get(i) + " je upotrebila " + s + " tužnih i " + h
						+ " srećnih smajlija, pa je zaključak da je više tužna.";
			else if (s < h)
				izvestaji[i] = "Osoba " + imena.get(i) + " je upotrebila " + s + " tužnih i " + h
						+ " srećnih smajlija, pa je zaključak da je više srećna.";
			else
				izvestaji[i] = "Osoba " + imena.get(i) + " je upotrebila " + s + " tužnih i " + h
						+ " srećnih smajlija, pa je zaključak da je podjednako i srećna i tužna.";
		}
		
		// Štampa izveštaje dispozicija za osobe u konzoli
		String izvestaj = "";
		for(int i = 0; i < izvestaji.length; i++)
			if( i == izvestaji.length - 1)
				izvestaj += izvestaji[i];
			else
				izvestaj += (izvestaji[i] + "\n");
		System.out.println(izvestaj);
		
		// Prikazuje izveštaje dispozicija za osobe u pop-up prozoru
		poruka("Dispozicija osoba", izvestaj);
		
		// Sumira sve Srećne/Tužne smajlije iz rezultujućih ArrayList-a
		int s = 0;
		int h = 0;
		for (int i = 0; i < brojTuznih.size(); i++) {
			s += brojTuznih.get(i);
			h += brojSrecnih.get(i);
		}
		
		// Štampa izveštaj dispozicije za sve chat-ove generalno u konzoli
		if (s > h)
			izvestaj = "\nChat-ovi generalno imaju negativnu dispoziciju, tj. više je tužnih " + s
					+ " nego srećnih " + h + " smajlija.";
		else if (s < h)
			izvestaj = "\nChat-ovi generalno imaju pozitivnu dispoziciju, tj. više je srećnih " + h
					+ " nego tužnih " + s + " smajlija.";
		else
			izvestaj = "\nChat-ovi generalno imaju neutralnu dispoziciju, tj. isti je broj tužnih " + s
					+ " i srećnih " + h + " smajlija.";
		System.out.println(izvestaj);

		// Rešenje 5.a:
		System.out.println("\n5a. Osobe sa najpozitivnijom i najnegativnijom dispozicijom\n    u smislu razlike (Happy - Sad) = dispozicija, pozitivna ili negativna:");
		ArrayList<Integer> razlika = new ArrayList<>();
		for (int i = 0; i < brojTuznih.size(); i++)
			razlika.add(brojSrecnih.get(i) - brojTuznih.get(i));
		int max = Collections.max(razlika);
		int min = Collections.min(razlika);
		for(int i = 0; i < razlika.size(); i++)
			if(razlika.get(i) == max)
				System.out.println("Osoba " + imena.get(i) + " ima najpozitivniju dispoziciju, tj. najsrećnija je (" + max + ").");
		for(int i = 0; i < razlika.size(); i++)
			if(razlika.get(i) == min)
				System.out.println("Osoba " + imena.get(i) + " ima najnegativniju dispoziciju, tj. najtužnija je (" + min + ").");
		
		// Rešenje 5.b:
		System.out.println("\n5b. Osobe sa najpozitivnijom i najnegativnijom dispozicijom\n    u smislu broja upotrebljenih Happy/Sad smajlija:");
		int maxHappy = Collections.max(brojSrecnih);
		int maxSad = Collections.max(brojTuznih);
		for(int i = 0; i < brojSrecnih.size(); i++)
			if(brojSrecnih.get(i) == maxHappy)
				System.out.println("Osoba " + imena.get(i) + " ima najpozitivniju dispoziciju, tj. najsrećnija je (" + maxHappy + ").");
		for(int i = 0; i < brojTuznih.size(); i++)
			if(brojTuznih.get(i) == maxSad)
				System.out.println("Osoba " + imena.get(i) + " ima najnegativniju dispoziciju, tj. najtužnija je (" + maxSad + ").");
	}

	// Analiza ljubavnih smajlija
	public void odmeriLjubav(String ime1, String ime2) {
		
		// Priprema podataka za prosleđivanje metodi konverzacija
		String datoteka1 = datoteke.get(imena.indexOf(ime1));
		String datoteka2 = datoteke.get(imena.indexOf(ime2));
		String pattern = TipSmajlija.LJUBAVNI.getSmajliji(); // zadajemo ljubavne smajlije kao pattern
		
		// Pozivamo static metodu konverzacija klase SmajliPomocnik
		int[]xy = SmajliPomocnik.konverzacija(ime1, ime2, datoteka1, datoteka2, pattern);

		// Štampamo zaključak
		System.out.print("\nAnalizom ljubavnih smajlija:\n" + ime1 + " -> " + xy[0] + "\n" + ime2 + " -> "
				+ xy[1] + "\nUtvrđeno je da ");
		if (xy[0] > xy[1])
			System.out.println(ime1 + " više voli " + ime2 + ".");
		else if (xy[0] < xy[1])
			System.out.println(ime2 + " više voli " + ime1 + ".");
		else
			System.out.println("se " + ime1 + " i " + ime2 + " vole istim intenzitetom.");
	}

	// Štampa tabelarni prikaz svih osoba
	public void listaPodataka() {
		System.out.println("______________________________________________________________________________");
		System.out.println("|     Ime     |   Prezime   |      Odanost      |       Datoteka chat-a      |");
		System.out.println("|-------------|-------------|-------------------|----------------------------|");
		for (int i = 0; i < imena.size(); i++) {
			System.out.print(String.format("| %-12s", imena.get(i)));
			System.out.print(String.format("| %-12s", prezimena.get(i)));
			System.out.print(String.format("| %-18s", odanosti.get(i)));
			System.out.print(String.format("| %-27s", datoteke.get(i)) + "|");
			if (i < imena.size() - 1)
				System.out.println("\n|-------------|-------------|-------------------|----------------------------|");
			else
				System.out.println("\n|_____________|_____________|___________________|____________________________|");
		}
	}
}
