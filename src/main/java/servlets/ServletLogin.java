package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DAOLoginRepository;
import model.Login;


@WebServlet(urlPatterns = {"/home/ServletLogin", "/ServletLogin"})
public class ServletLogin extends HttpServlet {
	
	
	private DAOLoginRepository dao = new DAOLoginRepository();
	private static final long serialVersionUID = 1L;
       
   
    public ServletLogin() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String login = request.getParameter("login");
		String pwd = request.getParameter("pwd");
		String url = request.getParameter("url");
	
		//System.out.println(url);
		try {
		
			// verify if inputs is not empty
			if((login != null && !login.isEmpty()) && (pwd != null && !pwd.isEmpty())) {
				
				
				Login modelLogin = new Login();
				modelLogin.setLogin(login);
				modelLogin.setPwd(pwd);
				
				//simulata an authentication
				if(dao.AuthLogin(modelLogin)) {
					
					request.getSession().setAttribute("usuario", modelLogin.getLogin());//start an session
					
					if(url == null || url.equals("null")) {
						url = "home/index.jsp";
					}
					
					RequestDispatcher redirect = request.getRequestDispatcher(url);
					redirect.forward(request, response);
					
				}else {
					RequestDispatcher redirect = request.getRequestDispatcher("/index.jsp");
					request.setAttribute("msg", "Login or password invalid!");
					redirect.forward(request, response);
				}
			
			}else {
				RequestDispatcher redirect = request.getRequestDispatcher("/index.jsp");
				request.setAttribute("msg", "Login or password invalid!");
				redirect.forward(request, response);
			}
			
		
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
