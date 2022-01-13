package package1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreateOrderUser1
 */
@WebServlet("/CreateOrderUser1")
public class CreateOrderUser1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private static String LIST_ALL = "createOrderUser.jsp";
	private MenuDAO dao;
	String forward = "";
	
    public CreateOrderUser1() {
        super();
        dao = new MenuDAO();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		forward = LIST_ALL;
		request.setAttribute("menuList", MenuDAO.getAll());
		
		RequestDispatcher view = request.getRequestDispatcher(forward);
		view.forward(request, response);
		
	}


}
