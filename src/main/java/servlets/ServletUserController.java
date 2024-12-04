package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DAOUserRepository;
import model.Login;


@WebServlet("/ServletUserController")
public class ServletUserController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private DAOUserRepository userRepo = new DAOUserRepository();

    public ServletUserController() {
        super();       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {
			
			String msg = "Operação realizada com sucesso!";
			
			//receive new user data from user page
			String id = request.getParameter("id");
			String username = request.getParameter("username");
			String email = request.getParameter("email");
			String login = request.getParameter("login");
			String pwd = request.getParameter("pwd");
		
			
			//set received data to a new login instance
			Login modelLogin = new Login();
			modelLogin.setId(id != null && !id.isEmpty() ? Long.parseLong(id) : null);
			modelLogin.setEmail(email);
			modelLogin.setUsername(username);
			modelLogin.setLogin(login);
			modelLogin.setPwd(pwd);
			
			//save user in db
			
			
			if(userRepo.isValid(modelLogin.getLogin()) && modelLogin.getId() == null) {
				msg = "Login alredy exist. Please use another one!";
			}
			
			userRepo.save(modelLogin);
			//get a user from db
			Login user = userRepo.getUser(modelLogin.getLogin());
			
			
			request.setAttribute("modelLogin", user);
			request.setAttribute("msg", msg);			
			RequestDispatcher redirect = request.getRequestDispatcher("home/user.jsp");
			redirect.forward(request, response);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
