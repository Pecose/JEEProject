package dao;

import java.sql.SQLException;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class DaoFactoryInitializer implements ServletContextListener{

	@Override
	public void contextInitialized(ServletContextEvent event) {
		try{
			event.getServletContext().setAttribute("DaoFactory", DaoFactory.getInstance());
		}catch(SQLException e){ e.printStackTrace(); }
    }
}
