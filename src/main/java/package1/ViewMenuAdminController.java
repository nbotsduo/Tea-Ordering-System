package package1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ViewMenuAdminController
 */
@WebServlet("/ViewMenuAdminController")
public class ViewMenuAdminController extends HttpServlet {
	private static String LIST_ALL = "viewProductAdmin.jsp";
	private MenuDAO dao;
	String forward = "";
	
	public ViewMenuAdminController() {
		super();
		dao = new MenuDAO();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		forward = LIST_ALL;
		request.setAttribute("menuList", MenuDAO.getAll());
		
		RequestDispatcher view = request.getRequestDispatcher(forward);
		view.forward(request, response);
		
	}

}
