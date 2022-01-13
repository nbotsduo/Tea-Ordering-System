package package1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeleteOrderAdminController
 */
@WebServlet("/DeleteOrderAdminController")
public class DeleteOrderAdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static String LIST_ALL = "viewOrderAdmin.jsp";
	private OrderDAO dao;
	String forward = "";

	public DeleteOrderAdminController() {
		super();
		dao = new OrderDAO();
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");

		if (action.equalsIgnoreCase("delete")) {
			int order_id = Integer.parseInt(request.getParameter("order_id"));
			dao.deleteOrder(order_id);
			forward = LIST_ALL;
			request.setAttribute("orderList", dao.getAll());
		}

		RequestDispatcher view = request.getRequestDispatcher(forward);
		view.forward(request, response);
	}



}
