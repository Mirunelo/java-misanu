package fajlovi;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Fajlovi_01 {

	public static void main(String[] args) throws IOException {

		// Omogućuje upisivanje podataka u datoteku 
		FileOutputStream fos = new FileOutputStream("zutastampa.txt");
		// Omogućuje upisivanje primitivnih Java podataka
		DataOutputStream dos = new DataOutputStream(fos);

		// Zadajemo String (Program obrađuje brojeve i slova latinice uključivši i naše karaktere)
		String str = "Žuto novinarstvo ili žuta štampa ili žuta žurnalistika je tip štampe koji predstavlja malo ili\r\n"
				+ "nikako legitimno dobro istražene vesti i umesto toga koristi alternativne naslove da proda što\r\n"
				+ "više novina. Tehnike mogu da uključuju preterivanje o vestima događaja, skandal huškanja ili\r\n"
				+ "senzacionalizam. Kao dodatak termin žuto novinarstvo se danas koristi kao pogrdan da osudi svako\r\n"
				+ "novinarstvo koje tretira vesti na neprofesionalan i ili neetički način.\r\n" + "\r\n"
				+ "Džozef Kembel definiše novine žute štampe kao takve da imaju svakodnevno više kolona naslova na\r\n"
				+ "naslovnoj strani koji pokrivaju različite teme, kao što su sport i skandal koristeći podebljane\r\n"
				+ "rasporede (sa velikom ilustracijom i možda bojenje), oslanjajući se na neimenovane izvore i\r\n"
				+ "neskrivenu promociju. Termin je korišćen da bi se opisale neke glavne novine u Njujorku oko 1900.\r\n"
				+ "godine kako su se borile za tiraž.\r\n" + "\r\n"
				+ "Frenk Luter Mot definiše žuto novinarstvo kao termin od 5 karakteristika:\r\n" + "\r\n"
				+ "1.	zastrašujuće naslove sa velikim utiskom, često sa što manje vesti\r\n"
				+ "2.	raskošna upotreba slika ili izmišljenih crteža\r\n"
				+ "3.	koristi lažne intervjue, pogrešne naslove, pseudonauku i paradu lažnih učenja kako se to\r\n"
				+ "	zove od strane stručnjaka\r\n"
				+ "4.	naglasak na punoj boji nedeljnih dodataka, obično sa stripovima\r\n"
				+ "5.	dramatična simpatija \"autsajdera\" protiv sistema.";

		// Upis Stringa u datoteku
		dos.writeUTF(str);
		// Provera da li je sve zapisano pre zatvaranja strima
		dos.flush();
		// Ne želimo više da upisujemo ništa i zatvaramo fos i dos
		fos.close();
		dos.close();

		// Omogućuje čitanje podataka iz datoteke
		FileInputStream fis = new FileInputStream("zutastampa.txt");
		// Omogućuje čitanje primitivnih Java podataka
		DataInputStream dis = new DataInputStream(fis);

		// Prosto ispisujemo naš tekst na ekranu
		System.out.println("Zadati tekst:\n\n" + str + "\n\n-\t-\t-\t-\t-\t-\t-\t-\t-\t-\t-\t-\t-");
		
		// Čitamo podatke iz datoteke i konvertujemo ih u niz karaktera ch[]
		char[] ch = dis.readUTF().toCharArray();

		// Ne želimo više ništa da čitamo iz datoteke i zatvaramo fis i dis
		fis.close();
		dis.close();
		
		// Kreiramo ArrayList za reči
		ArrayList<String> al = new ArrayList<>();
		// Kreiramo ArrayList za brojeve
		ArrayList<Integer> numbers = new ArrayList<>();
		
		// Resetujemo Stringove str(za slova) i nmb(za brojeve)
		str = "";
		String nmb = "";
		// Očitavamo formirani niz karaktera ch[]
		for (Character c : ch) {
			// Provera da li su u pitanju slova abecede
			if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= 'Ć' && c <= 'ž'))
				str += c;
			// Provera da li su brojevi u pitanju
			else if (c >= 48 && c <= 57)
				nmb += c;			
			else {
				// Uslov da smo pronašli reč
				if (str != "") {
					// Dodajemo reč u ArrayList Stringova
					al.add(str);
					// Resetujemo str promenljivu
					str = "";
				}
				// Uslov da smo pronašli broj
				else if (nmb != "") {
					// String nmb konvertujemo u Integer broj i dodajemo ga ArrayList-i brojeva
					numbers.add(Integer.parseInt(nmb));
					// Resetujemo nmb promenljivu
					nmb = "";
					
				}

			}

		}

		// Ispisuje sve članove String ArrayList-e
		System.out.println("\nSvi članovi naše ArrayList-e slova:");
		for (String s : al)
			System.out.print(s + ", ");
		
		System.out.println();
		
		// Ispisuje sve članove Integer ArrayList-e
		System.out.println("\nSvi članovi naše ArrayList-e brojeva:");
		for (Integer n: numbers)
			System.out.print(n + ", ");
		
		// Ispisuje veličine naše dve liste koje predstavljaju broj reči i brojeva u tekstu
		System.out.println("\n\nU našem tekstu ima " + al.size() + " reči i " + numbers.size() + " brojeva.");

	}

}
