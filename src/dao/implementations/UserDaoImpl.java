package dao.implementations;

import java.sql.Connection;
import java.sql.SQLException;
import User.User;
import dao.interfaces.UserDao;

public class UserDaoImpl implements UserDao{

	private Connection connection;
	public UserDaoImpl(Connection connection){
		this.connection = connection;
	}

	@Override
	public void addUser(User user) throws SQLException{
		// TODO Auto-generated method stub
		
	}

	@Override
	public User getUser() throws SQLException{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeUser(int id) throws SQLException{
		// TODO Auto-generated method stub
		
	}

}
