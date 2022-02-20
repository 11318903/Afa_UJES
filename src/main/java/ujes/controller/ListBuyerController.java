package ujes.controller;

import java.io.IOException; 
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException ;
import javax.servlet.annotation.WebServlet ;
import javax.servlet.http.HttpServlet ;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest ;
import ujes.dao.BuyerAdminDAO;

@WebServlet("/ListBuyerController")
public class ListBuyerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private BuyerAdminDAO dao;
	
	public ListBuyerController () {
		super();
		dao = new BuyerAdminDAO();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setAttribute("buy", BuyerAdminDAO.getAllBuyers());
		RequestDispatcher view = request.getRequestDispatcher("buyerList.jsp");
		view.forward(request, response);
	
	}
	
}
