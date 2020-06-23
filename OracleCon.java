package Ejemplos;

import java.sql.*;

public class OracleCon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1700:XE","EVALUACIONES","123");
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
