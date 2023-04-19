package poslasticaraNaSteroidima;

import java.io.*;
import java.util.Random;

public class Main {
	
	public static DbMySQL con = new DbMySQL("jdbc:mysql://localhost:3306/poslasticara","root","");
	
	public static void main(String[] args) throws Exception {
		
		// Main Start -->
		
		System.out.println("========================================\n=> JAVA program za manipulaciju bazom <=\n========================================");
		
		start();
		
		// Main End.
		
	}
	
	/// KOLEKCIJA STATIC METODA ///
	
	// Start:
	private static void start() throws NumberFormatException, IOException {
		
int option = 0;
		
		try {
			while(option != 6) {
				System.out.println("\nIzaberite:\n0. Prikaz tabela\n1. Upis podataka u bazu;\n2. Izmena podatka u bazi;\n3. Brisanje podataka iz baze;\n4. Simulacija kupovine sladoleda;\n5. Dodavanje sladoleda u ponudu željene poslastičare\n6. Kraj.");
				option = Integer.parseInt(enterSomeStuff());
				
				switch (option) {
				case 0:
					System.out.println();
					select("SELECT * FROM poslasticare ORDER BY poslasticaraID");
					System.out.println();
					select("SELECT * FROM sladoledi ORDER BY sladoledID");
					System.out.println();
					select("SELECT * FROM deca ORDER BY deteID");					
					break;
				case 1:
					insert();
					break;
				case 2:
					update();
					break;
				case 3:
					delete();
					break;
				case 4:
					sim();
					break;
				case 5:
					add();
					break;
				case 6:
					System.out.println("\nBaza diskonektovana...");
					option = 6;
					break;
				default:
					throw new NumberFormatException("");
						
				}
				
			}
			
		}catch (NumberFormatException e) {
			System.err.println("Pogrešan unos...\nPokušajte ponovo.");
			start();
		}
		
	}
	
	private static void add() throws NumberFormatException, IOException {

		// Dodavanje sladoleda poslastičari
		System.out.println();
		select("SELECT * FROM poslasticare ORDER BY poslasticaraID");
		System.out.print("\nUnesite ID poslastičaru kojoj želite dodeliti ID sladoleda u ponudu: ");
		String id = enterSomeStuff();
		System.out.println("\nPrikaz trenutne ponude:\n");
		select("SELECT poslasticaraID, sladoledID FROM poslasticaresladoledi WHERE poslasticaraID=" + id);
		System.out.println("\nUkupna ponuda svih sladoleda iz lanca poslatičara:");
		select("SELECT * FROM sladoledi ORDER BY sladoledID");
		System.out.print("\nUnesite ID sladoleda koji želite uvrstiti u ponudu: ");
		String sladID = enterSomeStuff();
		con.updateQuery("INSERT INTO poslasticaresladoledi(poslasticaraID, sladoledID) VALUES (" + id + "," + sladID + ")");
		
	}

	private static void sim() throws NumberFormatException, IOException {
		
		// Simulacija kupovine sladoleda u poslastičari:
		Random ru = new Random();
		
		// Random dete:
		int[] iddeca = select("SELECT * FROM deca");
		int rand_dete = iddeca[(ru.nextInt(iddeca.length))];
		
		// Random poslastičara:
		int[] idpos = select("SELECT * FROM poslasticare");
		int rand_pos = idpos[(ru.nextInt(idpos.length))];
		
		// Dete kupuje random sladoled dostupan u poslastičari:
		int[] idslad = select("SELECT sladoledID, poslasticaraID FROM poslasticaresladoledi WHERE poslasticaraID = " + rand_pos);
		int rand_slad = idslad[(ru.nextInt(idslad.length))];
		int kol = 1 + ru.nextInt(5);
		con.updateQuery("INSERT INTO poslasticaredeca(poslasticaraID, deteID) VALUES (" + rand_pos + "," + rand_dete + ")");
		con.updateQuery("INSERT INTO decasladoledi(kolicina, deteID, sladoledID) VALUES (" + kol + "," + rand_dete + "," + rand_slad + ")");
		System.out.println("Dete ID: " + rand_dete + "\nje u poslastičari ID: " + rand_pos + "\nkupilo: " + kol + " kom.\nsladoleda ID: " + rand_slad);
		
	}

	// Insert:
	private static void insert() throws NumberFormatException, IOException {

		int option = 0;
		
		try {
			while(option != 4) {
				System.out.println("Unesite broj baze za unos podataka:\n1. Poslastičarnice;\n2. Sladoledi;\n3. Deca;\n4. Povratak u glavni meni.");
		
				switch(Integer.parseInt(enterSomeStuff())) {
				case 1:
					System.out.println();
					select("SELECT * FROM poslasticare ORDER BY poslasticaraID");
					System.out.print("\nID poslastičare: ");
					String id = enterSomeStuff();
					System.out.print("\nnaziv: ");
					String naziv = enterSomeStuff();
					System.out.print("\ngrad: ");
					String grad = enterSomeStuff();
					System.out.print("\nulica: ");
					String ulica = enterSomeStuff();
					System.out.print("\nbroj: ");
					String broj = enterSomeStuff();
					String query = "('" + id + "','" + naziv + "','" + grad + "','"+ ulica +"','" + broj + "')";
					con.updateQuery("INSERT INTO poslasticare(poslasticaraID, naziv, grad, ulica, broj) VALUES" + query);
					break;
				case 2:
					System.out.println();
					select("SELECT * FROM sladoledi ORDER BY sladoledID");
					System.out.print("\nID sladoleda: ");
					id = enterSomeStuff();
					System.out.print("\nnaziv: ");
					naziv = enterSomeStuff();
					query = "('" + id + "','" + naziv + "')";
					con.updateQuery("INSERT INTO sladoledi(sladoledID, nazivSladoleda) VALUES" + query);
					break;
				case 3:
					System.out.println();
					select("SELECT * FROM deca ORDER BY deteID");
					System.out.print("\nID deteta: ");
					id = enterSomeStuff();
					System.out.print("\nime: ");
					String ime = enterSomeStuff();
					System.out.print("\nprezime: ");
					String prezime = enterSomeStuff();
					System.out.print("\nnajdraži sladoled: ");
					naziv = enterSomeStuff();
					query = "('" + id + "','" + ime + "','" + prezime + "','"+ naziv + "')";
					con.updateQuery("INSERT INTO deca(deteID, ime, prezime, najdraziSladoled) VALUES" + query);
					break;
				case 4:
					System.out.println("\nBaza diskonektovana...\n");
					option = 4;
					break;
				default:
					throw new NumberFormatException("");
		}
		
			}
			
		}catch (NumberFormatException e) {
			System.err.println("Pogrešan unos...\nPokušajte ponovo.");
			insert();
		}
		
	}
	
	// Update:
	private static void update() throws NumberFormatException, IOException {
		
		int option = 0;
		
		try {
			while(option != 4) {
				System.out.println("Unesite broj baze za izmenu podataka:\n1. Poslastičarnice;\n2. Sladoledi;\n3. Deca;\n4. Povratak u glavni meni.");
		
				switch(Integer.parseInt(enterSomeStuff())) {
				case 1:
					System.out.println();
					select("SELECT * FROM poslasticare ORDER BY poslasticaraID");
					System.out.print("\nUnesite ID poslastičare kojoj želite izmeniti podatke: ");
					String id = enterSomeStuff();
					System.out.print("\nnovi naziv: ");
					String naziv = enterSomeStuff();
					System.out.print("\ngrad: ");
					String grad = enterSomeStuff();
					System.out.print("\nulica: ");
					String ulica = enterSomeStuff();
					System.out.print("\nbroj: ");
					String broj = enterSomeStuff();
					String query = " UPDATE poslasticare SET naziv='" + naziv + "',grad='" + grad + "',ulica='" + ulica + "',broj='" + broj + "' WHERE poslasticaraID = " + id;
					con.updateQuery(query);
					break;
				case 2:
					System.out.println();
					select("SELECT * FROM sladoledi ORDER BY sladoledID");
					System.out.print("\nUnesite ID sladoleda kojeg želite izmeniti: ");
					id = enterSomeStuff();
					System.out.print("\nnaziv: ");
					naziv = enterSomeStuff();
					query = "UPDATE sladoledi SET nazivSladoleda='" + naziv + "' WHERE sladoledID = " + id;
					con.updateQuery(query);
					break;
				case 3:
					System.out.println();
					select("SELECT * FROM deca ORDER BY deteID");
					System.out.print("\nUnesite ID deteta kojem želite promeniti podatke: ");
					id = enterSomeStuff();
					System.out.print("\nime: ");
					String ime = enterSomeStuff();
					System.out.print("\nprezime: ");
					String prezime = enterSomeStuff();
					System.out.print("\nnajdraži sladoled: ");
					naziv = enterSomeStuff();
					query = "UPDATE deca SET ime='" + ime + "',prezime='" + prezime + "',najdraziSladoled='" + naziv + "' WHERE deteID=" + id;
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
			
		}catch (NumberFormatException e) {
			System.err.println("Pogrešan unos...\nPokušajte ponovo.");
			update();
		}

	}
	
	// Delete:
	private static void delete() throws NumberFormatException, IOException {
		
int option = 0;
		
		try {
			while(option != 4) {
				System.out.println("Unesite broj baze za brisanje podataka:\n1. Poslastičarnice;\n2. Sladoledi;\n3. Deca;\n4. Povratak u glavni meni.");
		
				switch(Integer.parseInt(enterSomeStuff())) {
				case 1:
					System.out.println();
					select("SELECT * FROM poslasticare ORDER BY poslasticaraID");
					System.out.print("\nUnesite ID poslastičare koju želite obrisati: ");
					String id = enterSomeStuff();
					con.updateQuery("DELETE FROM poslasticare WHERE poslasticaraID = " + id);
					break;
				case 2:
					System.out.println();
					select("SELECT * FROM sladoledi ORDER BY sladoledID");
					System.out.print("\nUnesite ID sladoleda kojeg želite obrisati: ");
					id = enterSomeStuff();
					con.updateQuery("DELETE FROM sladoledi WHERE sladoledID = " + id);
					break;
				case 3:
					System.out.println();
					select("SELECT * FROM deca ORDER BY deteID");
					System.out.print("\nUnesite ID deteta kojeg želite obrisati: ");
					id = enterSomeStuff();
					con.updateQuery("DELETE FROM deca WHERE deteID = " + id);
					break;
				case 4:
					System.out.println("\nBaza diskonektovana...\n");
					option = 4;
					break;
				default:
					throw new NumberFormatException("");
		}
		
			}
			
		}catch (NumberFormatException e) {
			System.err.println("Pogrešan unos...\nPokušajte ponovo.");
			delete();
		}
		
	}
	
	// Select:
	private static int[] select(String query) {
		String[][] str = con.selectQuery(query);
		int[] ids = new int[str.length - 1];
		for(int i = 1; i < str.length; i++)
			ids[i-1] = Integer.parseInt(str[i][0]);
			
		System.out.println("\n=================================================================================================================");
		
		for(int i=0; i< str.length; i++) {
			for(int j=0;j<str[i].length;j++) {
				System.out.print(String.format("| %-20s", str[i][j]));
			}
			System.out.println("\n-----------------------------------------------------------------------------------------------------------------");
		}
		
		return ids;
		
	}
	
	// Unos sa tastature
	public static String enterSomeStuff() throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		return bf.readLine();
	}
	
}
