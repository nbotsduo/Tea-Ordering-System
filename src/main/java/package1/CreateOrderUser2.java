package package1;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreateOrderUser2
 */
@WebServlet("/CreateOrderUser2")
public class CreateOrderUser2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public String name(int menu_id) {
		String name = null;

		return name;
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		int menu_id = Integer.parseInt(request.getParameter("menu_id"));
		Menu men = MenuDAO.getMenuID(menu_id);
		String name = men.getName();
		Double price= men.getPrice();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
		LocalDateTime now = LocalDateTime.now();
		String order_time=dtf.format(now);
		try {
			Order od = new Order();

			int user_id = Integer.parseInt(request.getParameter("user_id"));


			od.setPrice(price);
			od.setStatus("Ordered");
			od.setOrder_time(order_time);
			od.setPickup_time(request.getParameter("pickup_time"));
			od.setRequest(request.getParameter("request"));
			od.setUser_id(user_id);
			od.setMenu_id(menu_id);
			od.setOrder_name(name);

			OrderDAO.createOrder(od);

			response.sendRedirect("ViewOrderUserController?action=viewOrderUser.jsp&user_id="+user_id);
		} catch (Throwable ex) {
			System.out.println(ex);
		}
	}

}
