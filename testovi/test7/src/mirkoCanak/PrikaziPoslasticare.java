package mirkoCanak;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PrikaziPoslasticare {

	String url, userName, password;
	
	public PrikaziPoslasticare(String url, String userName, String password) {
		this.url = url;
		this.userName = userName;
		this.password = password;
	}
	
	// SELECT:
	void select(String query){
		
		try(Connection conn = DriverManager.getConnection(url, userName, password)){
			
			System.out.println("Prikaz tabele Poslastičare:\n");
			Statement stmt = conn.createStatement();
			ResultSet result = stmt.executeQuery(query);
			
			while(result.next()) {
				
				String poslasticaraID = result.getString(1);
				String naziv = result.getString(2);
				String grad = result.getString(3);
				String ulica = result.getString(4);
				String broj = result.getString(5);
				
				StringBuilder builder = new StringBuilder();
				
				builder.append("ID: ");
				builder.append(poslasticaraID);
				builder.append("\nNaziv: ");
				builder.append(naziv);
				builder.append("\nGradD: ");
				builder.append(grad);
				builder.append("\nUlica: ");
				builder.append(ulica);
				builder.append("\nbroj: ");
				builder.append(broj);
				
				System.out.println(builder.toString());
				System.out.println();
				
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	// INSERT:
	void insert(String query) throws IOException {
		
try(Connection conn = DriverManager.getConnection(url, userName, password)){
			
			PreparedStatement ps = conn.prepareStatement(query);
			
			System.out.println("\nUnos podataka u bazu:\n");
			System.out.print("Unesite ID poslastičare: ");
			ps.setString(1, enterSomething());
			System.out.print("Unesite naziv: ");
			ps.setString(2, enterSomething());
			System.out.print("Unesite grad: ");
			ps.setString(3, enterSomething());
			System.out.print("Unesite ulicu: ");
			ps.setString(4, enterSomething());
			System.out.print("Unesite broj: ");
			ps.setString(5, enterSomething());
			
			if(ps.executeUpdate()>0)
				System.out.println("Podaci o novoj poslastičarnici su upisani.");
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

	// Unos sa glavnog ulaza:
	private String enterSomething() throws IOException {
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		return ulaz.readLine();
	}
		
}
