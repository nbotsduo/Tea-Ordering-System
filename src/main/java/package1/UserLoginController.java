package package1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class UserLoginController
 */
@WebServlet("/UserLoginController")
public class UserLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			User user = new User();
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();

//			Get username and password
			user.setUsername(request.getParameter("username"));
			user.setPassword(request.getParameter("password"));
			user = UserDAO.login(user);
			
//			Set user session admin_id if isValid=true
			if (user.isValid()) {
//				Get the current session
				HttpSession session = request.getSession(true);
				session.setAttribute("user_id", user.getUser_id());
				response.sendRedirect("homeUser.jsp");
			} else {
				request.setAttribute("err", true);
//				
				request.getRequestDispatcher("invalidUserLogin.html").forward(request, response);
			}
		} catch (Throwable ex) {
			System.out.println(ex);
		}
	}

}
