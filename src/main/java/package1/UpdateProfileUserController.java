package package1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateProfileUserController
 */
@WebServlet("/UpdateProfileUserController")
public class UpdateProfileUserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private UserDAO dao;
	private static String LIST_ALL = "homeUser.jsp";
	String forward = "";

	public UpdateProfileUserController() {
		super();
		dao = new UserDAO();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int user_id = Integer.parseInt(request.getParameter("user_id"));

		User u = dao.getUser(user_id);
		request.setAttribute("u", u);
		RequestDispatcher view = request.getRequestDispatcher("updateProfileUser.jsp");
		view.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.print("test");
		User u = new User();

		int user_id = Integer.parseInt(request.getParameter("user_id"));
		
		u.setName(request.getParameter("name"));
		u.setUsername(request.getParameter("username"));
		u.setPassword(request.getParameter("password"));
		u.setEmail(request.getParameter("email"));
		u.setBirthdate(request.getParameter("birthdate"));
		u.setUser_id(user_id);
		
		dao.updateUser(u);

		response.sendRedirect("ViewProfileUserController?action=viewProfileUser.jsp&user_id="+user_id);
	}

}
