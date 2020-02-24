package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import dao.implementations.UserDaoImpl;
import dao.interfaces.UserDao;

public class DaoFactory{
	private static Connection connection;
//	
//	private static Connection getConnection() throws SQLException {
//		return connection;
//	}
	
	public static DaoFactory getInstance() throws SQLException {
		if(connection ==null){ connection = DriverManager.getConnection("jdbc:postgresql://localhost:1813/postgres", "postgres", "1234"); }
		return new DaoFactory();
	}
	
	public static UserDao getUserDao(){
		return new UserDaoImpl(connection);
	}

//	public static Statement createStatement() throws SQLException{
//		return getConnection().createStatement();
//	}
//
//	public static ResultSet executeQuery(String sql) throws SQLException{
//		return createStatement().executeQuery(sql);
//	}
//	
//	public static UserDao getUserDao() throws SQLException{
//		return new UserDaoImpl();
//	}

}
