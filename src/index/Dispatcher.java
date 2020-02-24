package index;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Dispatcher implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException{

		HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpServletResponse httpResponse = (HttpServletResponse) response;

		HttpSession session = httpRequest.getSession();
		String username = (String) httpRequest.getParameter("username");
		String password = (String) httpRequest.getParameter("password");

		if(session.getAttribute("username") == null) {
			if(username == null || password == null) {
				httpResponse.sendRedirect("/TestJEE/connexion/accueil");
				return;
			}else if(username.equals("aze") && password.equals("aze")){
				session.setAttribute("username", username);
			}
			httpResponse.sendRedirect("/TestJEE/jsp/index");
		}else{
			chain.doFilter(request, response);
		}
		
	}

}
