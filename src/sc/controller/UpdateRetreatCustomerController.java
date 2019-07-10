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
 * Servlet implementation class UpdateRetreatCustomerController
 */
@WebServlet("/UpdateRetreatCustomerController")
public class UpdateRetreatCustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateRetreatCustomerController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String ID = request.getParameter("ID");
		System.out.println("更新连接");
		System.out.println(ID);
		String customerID = request.getParameter("customerID");
		System.out.println(customerID);
		String retreatTime = request.getParameter("retreatTime");
		String reason = request.getParameter("reason");
		String describe = request.getParameter("describe");
		String askTime = request.getParameter("askTime");
		RetreatCustomer retreatCustomer = new RetreatCustomer(Integer.parseInt(ID), Integer.parseInt(customerID), retreatTime, reason, describe, askTime);
		RetreatCustomerDao retreatCustomerDao = new RetreatCustomerDao();
		retreatCustomerDao.update(retreatCustomer);
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
