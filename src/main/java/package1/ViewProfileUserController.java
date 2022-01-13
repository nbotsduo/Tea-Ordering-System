package package1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ViewProfileUserController
 */
@WebServlet("/ViewProfileUserController")
public class ViewProfileUserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private static String LIST_ALL = "homeUser.jsp";
	private UserDAO dao;
	String forward = "";
    public ViewProfileUserController() {
        super();
        dao = new UserDAO();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int user_id=Integer.parseInt(request.getParameter("user_id"));
		User u =dao.getUser(user_id);
		request.setAttribute("u", u);
		RequestDispatcher view = request.getRequestDispatcher("viewProfileUser.jsp");
		view.forward(request, response);
	}

	
}
