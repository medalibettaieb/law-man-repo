package utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtility {
	private static Connection connection;
	private static String url="jdbc:mysql://localhost:3306/jdbcBase";
	private static String user="root";
	private static String password="root";

	public static Connection giveMeJdbcConnection() {
		// loading the Mysql Driver Class
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver load");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		// configuring the Connection
		try {
			connection = DriverManager.getConnection(url, user, password);
			System.out.println("connection established");
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return connection;

	}

}
