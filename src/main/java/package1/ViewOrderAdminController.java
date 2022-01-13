package package1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ViewOrderAdminController
 */
@WebServlet("/ViewOrderAdminController")
public class ViewOrderAdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static String LIST_ALL = "viewOrderAdmin.jsp";
	private OrderDAO dao;
	String forward = "";
	
	public ViewOrderAdminController() {
		super();
		dao = new OrderDAO();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		forward = LIST_ALL;
		request.setAttribute("orderList", OrderDAO.getAll());
		
		RequestDispatcher view = request.getRequestDispatcher(forward);
		view.forward(request, response);
		
	}

}
