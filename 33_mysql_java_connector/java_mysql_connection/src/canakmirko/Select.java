package canakmirko;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Select {

	public static void main(String[] args) {
		/* adresa gde se nalazi baza sa kojom želimo da se povežemo kori */

		String url = "jdbc:mysql://localhost:3306/tb";
		String username = "root";
		String password = "";
		System.out.println("Konektovanje...");
		
		try(Connection conn = DriverManager.getConnection(url, username, password)){
			
			System.out.println("Uspešna konekcija sa bazom.\n");
			
			String sqlselect = "SELECT * FROM korisnici ORDER BY korisnikID";
			
			Statement stmt = conn.createStatement(); // objekat za komunikaciju sa bazom
			
			ResultSet result = stmt.executeQuery(sqlselect); // izvršavanje (namena)
			
			while(result.next()) {
				String id = result.getString(1);
				String ki = result.getString(2);
				String lo = result.getString(3);
				String ime = result.getString(4);
				String email = result.getString(5);
				
				StringBuilder builder = new StringBuilder();
				builder.append("ID korisnika: ");
				builder.append(id);
				builder.append("\nKorisničko ime: ");
				builder.append(ki);
				builder.append("\nLozinka: ");
				builder.append(lo);
				builder.append("\nIme: ");
				builder.append(ime);
				builder.append("\ne-mail: ");
				builder.append(email);
				
				System.out.println(builder.toString());
				System.out.println();
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
