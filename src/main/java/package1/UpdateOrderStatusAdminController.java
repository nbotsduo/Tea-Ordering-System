package package1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateOrderStatusAdminController
 */
@WebServlet("/UpdateOrderStatusAdminController")
public class UpdateOrderStatusAdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private OrderDAO dao;
	private static String LIST_ALL = "viewOrderAdmin.jsp";
	String forward = "";

	public UpdateOrderStatusAdminController() {
		super();
		dao = new OrderDAO();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int order_id = Integer.parseInt(request.getParameter("order_id"));

		Order od = dao.getOrder(order_id);
		Order o = new Order();
		int admin_id=1;
		String status = "Complete";
		o.setAdmin_id(admin_id);
		o.setStatus(status);
		o.setOrder_id(order_id);
		
		dao.updateOrderStatus(o);
		response.sendRedirect("ViewOrderAdminController?action=viewOrderAdmin.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
