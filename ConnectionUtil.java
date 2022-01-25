package UtilityPkg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class ConnectionUtil {

	public static Connection getDBconnection() throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Radhika","root","");
			return con;
		}
		catch(ClassNotFoundException e) {

			e.printStackTrace();

			return null;
		}
	}

}
