package biblioteke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public interface DbOperator {

	// CRUD OPERATIONS:

	// READ DATA:
	public default int[] select(String query, DbMySQL con) {
		String[][] str = con.selectQuery(query);
		int[] ids = new int[str.length - 1];
		for (int i = 1; i < str.length; i++)
			ids[i - 1] = Integer.parseInt(str[i][0]);

		System.out.println(
				"\n=======================================================================================================================================================================================================================================================================");

		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str[i].length; j++) {
				System.out.print(String.format("| %-25s", str[i][j]));
			}
			System.out.println(
					"\n-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		}

		return ids;

	}

	// CREATE DATA ENTRY:
	public default void insert(DbMySQL con) throws NumberFormatException, IOException {

		int option = 0;

		try {
			while (option != 4) {
				System.out.println(
						"Unos podataka:\n1. Biblioteke;\n2. Bibliotekari;\n3. Učlanjenje;\n4. Povratak u glavni meni.");

				switch (Integer.parseInt(enterSomeStuff())) {
				case 1:
					System.out.println();
					select("SELECT * FROM biblioteke ORDER BY bibliotekaID", con);
					System.out.print("\nID biblioteke: ");
					String id = enterSomeStuff();
					System.out.print("\nNaziv: ");
					String naziv = enterSomeStuff();
					System.out.print("\nMesto: ");
					String mesto = enterSomeStuff();
					System.out.print("\nulica: ");
					String ulica = enterSomeStuff();
					System.out.print("\nBroj: ");
					String broj = enterSomeStuff();
					System.out.print("\nTelefon: ");
					String telefon = enterSomeStuff();
					select("SELECT * FROM biblioteke ORDER BY bibliotekaID", con);
					String query = "('" + id + "','" + naziv + "','" + mesto + "','" + ulica + "','" + broj + "','"
							+ telefon + "')";
					con.updateQuery(
							"INSERT INTO `biblioteke`(`bibliotekaID`, `naziv`, `mesto`, `ulica`, `broj`, `telefon`)\r\n"
									+ "VALUES" + query);
					break;
				case 2:
					System.out.println();
					select("SELECT * FROM bibliotekari ORDER BY bibliotekarID", con);
					System.out.print("\nID bibliotekara: ");
					id = enterSomeStuff();
					System.out.print("\nŠifra zaposlenog: ");
					naziv = enterSomeStuff();
					System.out.print("\nIme: ");
					String ime = enterSomeStuff();
					System.out.print("\nPrezime: ");
					String prezime = enterSomeStuff();
					System.out.print("\nJMBG: ");
					String jmbg = enterSomeStuff();
					System.out.print("\nTelefon: ");
					telefon = enterSomeStuff();
					System.out.print("\nMesto: ");
					mesto = enterSomeStuff();
					System.out.print("\nulica: ");
					ulica = enterSomeStuff();
					System.out.print("\nBroj: ");
					broj = enterSomeStuff();
					select("SELECT * FROM biblioteke ORDER BY bibliotekaID", con);
					System.out.print("\nUnesite ID biblioteke u kojoj će raditi zaposleni: ");
					String idBiblioteke = enterSomeStuff();
					query = "('" + id + "','" + naziv + "','" + ime + "','" + prezime + "','" + jmbg + "','" + telefon
							+ "','" + mesto + "','" + ulica + "','" + broj + "','" + idBiblioteke + "')";
					con.updateQuery(
							"INSERT INTO `bibliotekari`(`bibliotekarID`, `sifraZaposlenog`, `ime`, `prezime`, `jmbg`, `telefon`, `mesto`, `ulica`, `broj`, `bibliotekaID`) VALUES"
									+ query);
					break;
				case 3:
					System.out.println();
					select("SELECT * FROM clanovi ORDER BY clanID", con);
					System.out.print("\nID člana: ");
					id = enterSomeStuff();
					System.out.print("\nBroj članske karte: ");
					String brKartice = enterSomeStuff();
					System.out.print("\nIme: ");
					ime = enterSomeStuff();
					System.out.print("\nPrezime: ");
					prezime = enterSomeStuff();
					System.out.print("\nDatum rođenja (GGGG-MM-DD): ");
					String datum = enterSomeStuff();
					System.out.print("\nTelefon: ");
					telefon = enterSomeStuff();
					System.out.print("\nMesto: ");
					mesto = enterSomeStuff();
					System.out.print("\nulica: ");
					ulica = enterSomeStuff();
					System.out.print("\nBroj: ");
					broj = enterSomeStuff();
					query = "('" + id + "','" + brKartice + "','" + ime + "','" + prezime + "','" + datum + "','"
							+ telefon + "','" + mesto + "','" + ulica + "','" + broj + "')";
					con.updateQuery(
							"INSERT INTO `clanovi`(`clanID`, `clanskaKarta`, `ime`, `prezime`, `datumRodjenja`, `telefon`, `mesto`, `ulica`, `broj`)\r\n"
									+ "VALUES" + query);
					select("SELECT * FROM biblioteke ORDER BY bibliotekaID", con);
					System.out.print("\nID biblioteke u koju se član upisuje: ");
					idBiblioteke = enterSomeStuff();
					datum = danasnjiDatum();
					query = "('" + datum + "','" + idBiblioteke + "','" + id + "')";
					con.updateQuery(
							"INSERT INTO `bibliotekeclanovi`(`datumUpisa`, `bibliotekaID`, `clanID`) VALUES" + query);
					break;
				case 4:
					System.out.println("\nBaza diskonektovana...\n");
					option = 4;
					break;
				default:
					throw new NumberFormatException("");
				}

			}

		} catch (NumberFormatException e) {
			System.err.println("Pogrešan unos...\nPokušajte ponovo.");
			insert(con);
		}

	}

	// UPDATE DATA:
	public default void update(DbMySQL con) throws NumberFormatException, IOException {

		int option = 0;

		try {
			while (option != 4) {
				System.out.println(
						"Šta želite da izmenite:\n1. Biblioteke;\n2. Zaposleni;\n3. Članovi;\n4. Povratak u glavni meni.");

				switch (Integer.parseInt(enterSomeStuff())) {
				case 1:
					System.out.println();
					select("SELECT * FROM biblioteke ORDER BY bibliotekaID", con);
					System.out.print("\nUnesite ID biblioteke kojoj želite izmeniti podatke: ");
					String id = enterSomeStuff();
					System.out.print("\nNaziv: ");
					String naziv = enterSomeStuff();
					System.out.print("\nMesto: ");
					String mesto = enterSomeStuff();
					System.out.print("\nUlica: ");
					String ulica = enterSomeStuff();
					System.out.print("\nBroj: ");
					String broj = enterSomeStuff();
					System.out.print("\nTelefon: ");
					String telefon = enterSomeStuff();
					String query = " UPDATE biblioteke SET naziv='" + naziv + "',mesto='" + mesto + "',ulica='" + ulica
							+ "',broj='" + broj + "',telefon='" + telefon + "' WHERE bibliotekaID = " + id;
					con.updateQuery(query);
					break;
				case 2:
					System.out.println();
					select("SELECT * FROM bibliotekari ORDER BY bibliotekarID", con);
					System.out.print("\nUnesite ID zaposlenog kojem želite izmeniti podatke: ");
					id = enterSomeStuff();
					System.out.print("\nIme: ");
					String ime = enterSomeStuff();
					System.out.print("\nPrezime: ");
					String prezime = enterSomeStuff();
					System.out.print("\nJMBG: ");
					String jmbg = enterSomeStuff();
					System.out.print("\nTelefon: ");
					telefon = enterSomeStuff();
					System.out.print("\nMesto: ");
					mesto = enterSomeStuff();
					System.out.print("\nUlica: ");
					ulica = enterSomeStuff();
					System.out.print("\nBroj: ");
					broj = enterSomeStuff();
					query = " UPDATE bibliotekari SET ime='" + ime + "',prezime='" + prezime + "',jmbg='" + jmbg
							+ "',telefon='" + telefon + "',mesto='" + mesto + "',ulica='" + ulica + "',broj='" + broj
							+ "' WHERE bibliotekarID = " + id;
					con.updateQuery(query);
					break;
				case 3:
					System.out.println();
					select("SELECT * FROM clanovi ORDER BY clanID", con);
					System.out.print("\nUnesite ID člana kojem želite izmeniti podatke: ");
					id = enterSomeStuff();
					System.out.print("\nIme: ");
					ime = enterSomeStuff();
					System.out.print("\nPrezime: ");
					prezime = enterSomeStuff();
					System.out.print("\nDatum rođenja (GGGG-MM-DD): ");
					String datum = enterSomeStuff();
					System.out.print("\nTelefon: ");
					telefon = enterSomeStuff();
					System.out.print("\nMesto: ");
					mesto = enterSomeStuff();
					System.out.print("\nUlica: ");
					ulica = enterSomeStuff();
					System.out.print("\nBroj: ");
					broj = enterSomeStuff();
					query = "UPDATE clanovi SET ime='" + ime + "',prezime='" + prezime + "',datumRodjenja='" + datum
							+ "',telefon='" + telefon + "',mesto='" + mesto + "',ulica='" + ulica + "',broj='" + broj
							+ "' WHERE clanID=" + id;
					con.updateQuery(query);
					break;
				case 4:
					System.out.println("\nBaza diskonektovana...\n");
					option = 4;
					break;
				default:
					throw new NumberFormatException("");
				}

			}

		} catch (NumberFormatException e) {
			System.err.println("Pogrešan unos...\nPokušajte ponovo.");
			update(con);
		}

	}

	// DELETE DATA:
	public default void delete(DbMySQL con) throws NumberFormatException, IOException {

		int option = 0;

		try {
			while (option != 4) {
				System.out.println(
						"Unesite broj baze za brisanje podataka:\n1. Biblioteke;\n2. Zaposleni;\n3. Članovi;\n4. Povratak u glavni meni.");

				switch (Integer.parseInt(enterSomeStuff())) {
				case 1:
					System.out.println();
					select("SELECT * FROM biblioteke ORDER BY bibliotekaID", con);
					System.out.print("\nUnesite ID biblioteke koju želite obrisati: ");
					String id = enterSomeStuff();
					con.updateQuery("DELETE FROM biblioteke WHERE bibliotekaID = " + id);
					break;
				case 2:
					System.out.println();
					select("SELECT * FROM bibliotekari ORDER BY bibliotekarID", con);
					System.out.print("\nUnesite ID zaposlenog kojeg želite obrisati: ");
					id = enterSomeStuff();
					con.updateQuery("DELETE FROM bibliotekari WHERE bibliotekarID = " + id);
					break;
				case 3:
					System.out.println();
					select("SELECT * FROM clanovi ORDER BY clanID", con);
					System.out.print("\nUnesite ID člana kojeg želite obrisati: ");
					id = enterSomeStuff();
					con.updateQuery("DELETE FROM izdavanja WHERE clanID = " + id);
					con.updateQuery("DELETE FROM bibliotekeclanovi WHERE clanID = " + id);
					con.updateQuery("DELETE FROM clanovi WHERE clanID = " + id);
					break;
				case 4:
					System.out.println("\nBaza diskonektovana...\n");
					option = 4;
					break;
				default:
					throw new NumberFormatException("");
				}

			}

		} catch (NumberFormatException e) {
			System.err.println("Pogrešan unos...\nPokušajte ponovo.");
			delete(con);
		}

	}

	// Unos sa tastature
	public default String enterSomeStuff() throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		return bf.readLine();
	}

	// Današnji datum
	public default String danasnjiDatum() {
		long milis = System.currentTimeMillis();
		java.sql.Date datum = new java.sql.Date(milis);
		return datum.toString();
	}

}