package canakmirko;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/tb";
		String username = "root";
		String password = "";
		
		System.out.println("Konektovanje...");
		try(Connection conn = DriverManager.getConnection(url, username, password)){
			System.out.println("Uspešna konekcija sa bazom.");
			
			String sqlupdate = "UPDATE `korisnici` SET `lozinka`= ?, `ime`= ?, `email`= ? WHERE `korisnickoIme`= ?";
			
			PreparedStatement ps = conn.prepareStatement(sqlupdate);
			
			ps.setString(1, "123korisnik");
			ps.setString(2, "Neko");
			ps.setString(3, "neko@gmail.com");
			
			ps.setString(4, "korisnik1"); // uslov
			
			int promenjenPodatak = ps.executeUpdate();
			
			if(promenjenPodatak > 0) {
				System.out.println("Uspešno je izvršena izmena.");
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
