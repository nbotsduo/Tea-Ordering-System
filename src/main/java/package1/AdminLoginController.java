package package1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AdminLoginController
 */
@WebServlet("/AdminLoginController")
public class AdminLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			Admin admin = new Admin();
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();

//			Get username and password
			admin.setUsername(request.getParameter("username"));
			admin.setPassword(request.getParameter("password"));
			admin = AdminDAO.login(admin);
//			Set user session admin_id if isValid=true
			if (admin.isValid()) {
//				Get the current session
				HttpSession session = request.getSession(true);
				session.setAttribute("admin_id", admin.getAdmin_id());
				response.sendRedirect("homeAdmin.jsp");
			} else {
				request.setAttribute("err", true);
//				
				request.getRequestDispatcher("invalidLoginAdmin.html").forward(request, response);
			}
		} catch (Throwable ex) {
			System.out.println(ex);
		}
	}

}
