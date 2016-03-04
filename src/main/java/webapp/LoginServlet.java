package webapp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		checkUserValid user = new checkUserValid();
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		
		request.setAttribute("username", name);
		
		
		if(user.isValid(name, password)) {
			request.getRequestDispatcher("WEB-INF/views/welcome.jsp").forward(request, response);
		}
		else {
			request.setAttribute("errorMessage", "Invalid credentials!");
			request.getRequestDispatcher("WEB-INF/views/login.jsp").forward(request, response);
		}
		
		
		
		//if(name.equals("seb") && password.equals("changeme")) {}
	}

}
