package Ejemplos;

import java.sql.*;

public class EjemploSingleton {

	private static Connection conn = null;
	private String driver;
	private String url;
	private String usuario;
	private String password;
	
	private EjemploSingleton() {
		url = "jdbc:oracle:thin:@localhost:1700:xe";
		driver = "oracle.jdbc.driver.OracleDriver";
		usuario = "EVALUACIONES";
		password = "123";
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, usuario, password);	
		}
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() {
		if (conn == null) {
			new EjemploSingleton();
		}
		return conn;
	}
	
}
