package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Login;


@WebServlet("/ServletUserController")
public class ServletUserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public ServletUserController() {
        super();       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String id = request.getParameter("id");
		String username = request.getParameter("username");
		String email = request.getParameter("email");
		String login = request.getParameter("login");
		String pwd = request.getParameter("pwd");
	
		Login modelLogin = new Login();
		modelLogin.setId(id != null && !id.isEmpty() ? Long.parseLong(id) : null);
		modelLogin.setEmail(email);
		modelLogin.setUsername(username);
		modelLogin.setLogin(login);
		modelLogin.setPwd(pwd);
		
		request.setAttribute("modelLogin", modelLogin);
		
		RequestDispatcher redirect = request.getRequestDispatcher("home/user.jsp");
		redirect.forward(request, response);
		
	}

}
