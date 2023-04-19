package canakmirko;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/tb";
		String username = "root";
		String password = "";
		
		System.out.println("Konektovanje...");
		try(Connection conn = DriverManager.getConnection(url, username, password)){
			System.out.println("Uspešna konekcija sa bazom.");
			
			String sqlinsert = "INSERT INTO `korisnici`(`korisnickoIme`, `lozinka`, `ime`, `email`) VALUES (?, ?, ?, ?)";
			
			PreparedStatement ps = conn.prepareStatement(sqlinsert);
			
			ps.setString(1, "baltazar98");
			ps.setString(2, "mjauvau123");
			ps.setString(3, "Dragoslav");
			ps.setString(4, "draguljce@outlook.com");
			
			int unetPodatak = ps.executeUpdate();
			
			if(unetPodatak > 0) {
				System.out.println("Podatak je upisan.");
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
