package package1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreateMenuAdminController
 */
@WebServlet("/CreateMenuAdminController")
public class CreateMenuAdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		try {
			Menu m = new Menu();
			
			int id = Integer.parseInt(request.getParameter("admin_id"));
			double price = Double.parseDouble(request.getParameter("price"));
			m.setAdmin_id(id);
			m.setPrice(price);
			m.setName(request.getParameter("name"));
			m.setDesc(request.getParameter("description"));
			
			MenuDAO.createMenu(m);
			out.println ("<html><body><script>alert('Menu Created Succcessfully');</script></body></html>");
			response.sendRedirect("ViewMenuAdminController?action=viewProductAdmin.jsp");
		}catch(Throwable ex) {
			System.out.println(ex);
		}
	}

}
