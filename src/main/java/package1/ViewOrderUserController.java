package package1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ViewOrderUserController
 */
@WebServlet("/ViewOrderUserController")
public class ViewOrderUserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static String LIST_ALL = "viewOrderUser.jsp";
	private OrderDAO dao;
	String forward = "";
	
	public ViewOrderUserController() {
		super();
		dao = new OrderDAO();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		forward = LIST_ALL;
		int user_id=Integer.parseInt(request.getParameter("user_id"));
		
		request.setAttribute("orderList", OrderDAO.getUserAll(user_id));
		
		RequestDispatcher view = request.getRequestDispatcher(forward);
		view.forward(request, response);
		
	}

}
