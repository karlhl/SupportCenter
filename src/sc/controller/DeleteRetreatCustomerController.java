package sc.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sc.entity.RetreatCustomer;
import sc.it.RetreatCustomerDao;

/**
 * Servlet implementation class DeleteRetreatCustomerController
 */
@WebServlet("/DeleteRetreatCustomerController")
public class DeleteRetreatCustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteRetreatCustomerController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String ID = request.getParameter("ID");
		System.out.println("É¾³ýÁ¬½Ó");
		System.out.println(ID);
		RetreatCustomer retreatCustomer = new RetreatCustomer();
		retreatCustomer.setID(Integer.parseInt(ID));
		RetreatCustomerDao retreatCustomerDao = new RetreatCustomerDao();
		retreatCustomerDao.delete(retreatCustomer);
		response.sendRedirect("/SupportCenter//QueryRetreatCustomerController");		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
