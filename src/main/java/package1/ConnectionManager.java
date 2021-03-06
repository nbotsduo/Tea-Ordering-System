package package1;
import java.sql.*;

public class ConnectionManager {
	private static final String DB_CONNECTION = "jdbc:mysql://localhost:3306/teasystem";
	private static final String DB_USER = "root";
	private static final String DB_PASSWORD = "1234";
	private static Connection con = null;
	
	public static Connection getConnection() {		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("connected to driver");
			try {
				con = DriverManager.getConnection(DB_CONNECTION, DB_USER,DB_PASSWORD);
				System.out.println("connected to database");
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
		return con;
	}

}
