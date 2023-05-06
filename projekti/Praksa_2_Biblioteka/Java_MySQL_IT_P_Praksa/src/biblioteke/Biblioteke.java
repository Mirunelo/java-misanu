package biblioteke;

import java.io.IOException;

public class Biblioteke implements DbOperator {

	private String adresa;
	private String korisnik;
	private String sifra;
	private DbMySQL con;

	public Biblioteke(String adresa, String korisnik, String sifra) {
		this.adresa = adresa;
		this.korisnik = korisnik;
		this.sifra = sifra;
		con = new DbMySQL(this.adresa, this.korisnik, this.sifra);
	}

	public void GlavniMeni() throws NumberFormatException, IOException {

		int option = 0;

		try {
			while (option != 6) {
				System.out.println(
						"\nIzaberite:\n0. Prikaz tabela\n1. Upis podataka u tabele;\n2. Izmena podatka;\n3. Brisanje podataka iz tabele;\n4. <<Not implemented>>\n5. <<Not implemented>>\n6. Kraj.");
				option = Integer.parseInt(enterSomeStuff());

				switch (option) {
				case 0:
					System.out.println();
					select("SELECT * FROM biblioteke ORDER BY bibliotekaID", con);
					System.out.println();
					select("SELECT * FROM bibliotekari ORDER BY bibliotekarID", con);
					System.out.println();
					select("SELECT * FROM clanovi ORDER BY clanID", con);
					System.out.println();
					select("SELECT * FROM knjige ORDER BY knjigaID", con);
					System.out.println();
					select("SELECT * FROM izdavaci ORDER BY izdavacID", con);
					break;
				case 1:
					insert(con);
					break;
				case 2:
					update(con);
					break;
				case 3:
					delete(con);
					break;
				case 4:
					System.out.println("Not implemented");
					break;
				case 5:
					System.out.println("Not implemented");
					break;
				case 6:
					System.out.println("\nBaza diskonektovana...");
					option = 6;
					break;
				default:
					throw new NumberFormatException("");

				}

			}

		} catch (NumberFormatException e) {
			System.err.println("Pogrešan unos...\nPokušajte ponovo.");
			GlavniMeni();
		}

	}

}