package dao.interfaces;

import java.sql.SQLException;
import User.User;

public interface UserDao{
	public void addUser(User user) throws SQLException;
	public User getUser() throws SQLException;
	public void removeUser(int id) throws SQLException;
}
