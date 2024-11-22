package filter;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import connection.SingleConnectionDB;


@WebFilter(urlPatterns = {"/home/*"}) //intercept all requests to the home directory
public class FilterAuth extends HttpFilter implements Filter {
       
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private static Connection conn;
	

	public FilterAuth() {
        super();
    }

	//terminate all processes when the servver is off
	public void destroy() {
		
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	//intercept requests and responses
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		try {
			HttpServletRequest req = (HttpServletRequest)request;
			HttpSession session = req.getSession();
			
			String userLogged = (String) session.getAttribute("usuario");	
			String toAuthUrl = req.getServletPath();
			
			System.out.println(toAuthUrl + " : "+ userLogged);
			
			if(userLogged == null && (!toAuthUrl.equalsIgnoreCase("/home/ServletLogin"))) {
				
				RequestDispatcher redirect = request.getRequestDispatcher("/index.jsp?url="+toAuthUrl);
				request.setAttribute("msg", "Log in to continue!");
				request.setAttribute("session", userLogged);
				redirect.forward(request, response);
				return;
				
			}else {
				
				chain.doFilter(request, response);
			}
			
			
			
			
			conn.commit();
			
		}catch (Exception e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

	//initialize the processes
	public void init(FilterConfig fConfig) throws ServletException {
		
		conn = SingleConnectionDB.getConnection();
		
	}

}
