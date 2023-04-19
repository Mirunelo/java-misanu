package mirkoCanak;

import java.io.IOException;

public class Main {

	
	public static void main(String[] args) throws IOException {
		
		// Podaci za konekciju sa bazom:
		String url = "jdbc:mysql://localhost:3306/poslasticara";
		String userName = "root";
		String password = "";
		
		// Kreiranje objekta klase za manipulaciju bazom:
		PrikaziPoslasticare pos1 = new PrikaziPoslasticare(url, userName, password);
		
		// Prikaz baze:
		pos1.select("SELECT * FROM poslasticare ORDER BY poslasticaraID");
		
		// Upis podataka u bazu:
		pos1.insert("INSERT INTO `poslasticare`(`poslasticaraID`, `naziv`, `grad`, `ulica`, `broj`) VALUES (?, ?, ?, ?, ?)");
		
	}

}
