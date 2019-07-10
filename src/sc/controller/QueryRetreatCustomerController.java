package sc.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sc.entity.RetreatCustomer;
import sc.it.RetreatCustomerDao;

/**
 * Servlet implementation class QueryRetreatCustomerController
 */
@WebServlet("/QueryRetreatCustomerController")
public class QueryRetreatCustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QueryRetreatCustomerController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		System.out.println("连接成功");
		String name = request.getParameter("name");
		RetreatCustomerDao retreatCustomerDao = new RetreatCustomerDao();
		ArrayList<RetreatCustomer> retreatCustomers = retreatCustomerDao.queryRetreatCustomersByName(name);
		request.setAttribute("retreatCustomers",retreatCustomers);
		request.getRequestDispatcher("/queryRetreatCustomer.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
