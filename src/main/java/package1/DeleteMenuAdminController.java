package package1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeleteMenuAdminController
 */
@WebServlet("/DeleteMenuAdminController")
public class DeleteMenuAdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private static String LIST_ALL="viewProductAdmin.jsp";
	private MenuDAO dao;
	String forward="";
	
    public DeleteMenuAdminController() {
        super();
        dao = new MenuDAO();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action=request.getParameter("action");
		
		if(action.equalsIgnoreCase("delete")) {
			int menu_id = Integer.parseInt(request.getParameter("menu_id"));
			dao.deleteMenu(menu_id);
			forward = LIST_ALL;
			request.setAttribute("menuList", dao.getAll());
		}
		
		RequestDispatcher view = request.getRequestDispatcher(forward);
		view.forward(request, response);
		
	}

	

}
