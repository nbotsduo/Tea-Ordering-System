package package1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ViewDetailedOrderAdminController
 */
@WebServlet("/ViewDetailedOrderAdminController")
public class ViewDetailedOrderAdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static String LIST_ALL = "viewOrderAdmin.jsp";
	private OrderDAO dao;
	String forward = "";
	
    public ViewDetailedOrderAdminController() {
        super();
        dao = new OrderDAO();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
forward = LIST_ALL;
		
		int order_id=Integer.parseInt(request.getParameter("order_id"));
		Order od = dao.getOrder(order_id);
		request.setAttribute("od", od);
		RequestDispatcher view = request.getRequestDispatcher("viewDetailOrderAdmin.jsp");
		view.forward(request, response);
	}


}
