package Ejemplos;

import java.sql.*;

public class UsoSingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Connection con = EjemploSingleton.getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from cliente");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
			}
			con.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
