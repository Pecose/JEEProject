package index;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database{
	private static Connection connection;
	
	public static  Connection getConnection() throws SQLException {
		if(connection !=null){ return connection; }
		connection = DriverManager.getConnection("jdbc:postgresql://localhost:1813/postgres", "postgres", "1234");
		return connection;
	}

	public static Statement createStatement() throws SQLException{
		return getConnection().createStatement();
	}

	public static ResultSet executeQuery(String sql) throws SQLException{
		return createStatement().executeQuery(sql);
	}
	
}
