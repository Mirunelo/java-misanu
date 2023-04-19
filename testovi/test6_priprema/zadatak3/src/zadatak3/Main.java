package zadatak3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static DbMySQL con = new DbMySQL("jdbc:mysql://localhost:3306/a3","root","");
	
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
			while(option != 5) {
				System.out.println("\nIzaberite:\n1. Upis podataka u bazu;\n2. Izmena podatka u bazi;\n3. Brisanje podataka iz baze;\n4. Prikaz baze;\n5. Kraj.");
				option = Integer.parseInt(enterSomeStuff());
				
				switch (option) {
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
					select("SELECT * FROM `biblioteke` ORDER BY bibliotekaID");
					break;
				case 5:
					System.out.println("\nBaza diskonektovana...");;
					option = 5;
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
	
	// Insert:
	private static void insert() throws NumberFormatException, IOException {
		
		System.out.print("\nIme biblioteke: ");
		String imeBiblioteke = enterSomeStuff();
		System.out.print("Ulica: ");
		String ulica = enterSomeStuff();
		System.out.print("broj: ");
		String broj = enterSomeStuff();
		
		String query = "('" + imeBiblioteke + "', '" + ulica + "','"+ broj + "')";
		con.updateQuery("INSERT INTO `biblioteke`(`imeBiblioteke`, `ulica`, `broj`) VALUES" + query);
		
	}
	
	// Update:
	private static void update() throws NumberFormatException, IOException {
		
		String imeBiblioteke, ulica, broj;
		String query = "";
		int id;
		select("SELECT * FROM `biblioteke` ORDER BY bibliotekaID");
		System.out.println("\nŠta želite da promenite:\n1. Ime biblioteke;\n2. Ulicu;\n3. Broj.");
		switch (Integer.parseInt(enterSomeStuff())) {
		case 1: {
			System.out.print("\nUnesite staro ime biblioteke: ");
			imeBiblioteke = enterSomeStuff();
			select("SELECT * FROM `biblioteke` WHERE imeBiblioteke = '" + imeBiblioteke + "'");
			System.out.print("\nUnesite ID biblioteke kojoj želite da promenite ime: ");
			id = Integer.parseInt(enterSomeStuff());
			System.out.print("Unesite novo ime: ");
			imeBiblioteke = enterSomeStuff();
			query = "UPDATE `biblioteke` SET `imeBiblioteke` = '" + imeBiblioteke + "' WHERE bibliotekaID = " + id;
			break;
		}
		case 2: {
			System.out.print("\nUnesite staro ime ulice: ");
			ulica = enterSomeStuff();
			select("SELECT * FROM `biblioteke` WHERE ulica = '" + ulica + "'");
			System.out.print("\nUnesite ID biblioteke kojoj želite da promenite ulicu: ");
			id = Integer.parseInt(enterSomeStuff());
			System.out.print("Unesite novo ime ulice: ");
			ulica = enterSomeStuff();
			query = "UPDATE `biblioteke` SET `ulica` = '" + ulica + "' WHERE bibliotekaID = " + id;
			break;
		}
		case 3: {
			System.out.print("\nUnesite stari broj: ");
			broj = enterSomeStuff();
			select("SELECT * FROM `biblioteke` WHERE `broj` = '" + broj + "'");
			System.out.print("\nUnesite ID biblioteke kojoj želite promeniti broj: ");
			id = Integer.parseInt(enterSomeStuff());
			System.out.print("Unesite novi broj: ");
			broj = enterSomeStuff();
			query = "UPDATE `biblioteke` SET `broj` = '" + broj + "' WHERE bibliotekaID = " + id;
			break;
		}
		
		}
		con.updateQuery(query);
	}
	
	// Delete:
	private static void delete() throws NumberFormatException, IOException {
		
		System.out.println();
		select("SELECT * FROM `biblioteke` ORDER BY bibliotekaID");
		System.out.print("\nUnesite ID biblioteke koju želite obrisati: ");
		int id = Integer.parseInt(enterSomeStuff());
		con.updateQuery("DELETE FROM `biblioteke` WHERE bibliotekaID = " + id);
		
	}
	
	// Select:
	private static void select(String query) {
		String[][] str = con.selectQuery(query);
		System.out.println("\n===================================================================================");
		
		for(int i=0; i< str.length; i++) {
			for(int j=0;j<str[i].length;j++) {
				//System.out.print(str[i][j] + "\t");
				System.out.print(String.format("| %-20s", str[i][j]));
			}
			System.out.println("\n-----------------------------------------------------------------------------------");
		}
		
	}
	
	// Unos sa tastature (Generic je besmislen. Čisto radi prikaza sintakse.)
	@SuppressWarnings("unchecked")
	public static <T> T enterSomeStuff() throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		return (T) bf.readLine();
	}
	
}
