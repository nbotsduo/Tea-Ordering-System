package package1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateMenuAdminController
 */
@WebServlet("/UpdateMenuAdminController")
public class UpdateMenuAdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    private MenuDAO dao;
    private static String LIST_ALL="viewProductAdmin.jsp";
    String forward="";
    
    public UpdateMenuAdminController() {
        super();
        dao = new MenuDAO();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int menu_id = Integer.parseInt(request.getParameter("menu_id"));
		
		Menu men = dao.getMenuID(menu_id);
		request.setAttribute("men", men);
		RequestDispatcher view = request.getRequestDispatcher("updateProductAdmin.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		Menu men = new Menu();
		
		int menu_id = Integer.parseInt(request.getParameter("menu_id"));
		int admin_id = Integer.parseInt(request.getParameter("admin_id"));
		double price = Double.parseDouble(request.getParameter("price"));
		
		men.setMenu_id(menu_id);
		men.setName(request.getParameter("name"));
		men.setDesc(request.getParameter("description"));
		men.setPrice(price);
		men.setAdmin_id(admin_id);
		
		dao.updateMenu(men);
//		out.println ("\"<html><body onload=\\\"alert('Product Updated Successfully')\\\"></body></html>\"");
		response.sendRedirect("ViewMenuAdminController?action=viewProductAdmin.jsp");
		
	}

}
