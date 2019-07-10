package sc.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sc.entity.Customer;
import sc.it.CustomerDao;

/**
 * Servlet implementation class QueryCustomerControllerForOut
 */
@WebServlet("/QueryCustomerControllerForOut")
public class QueryCustomerControllerForOut extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QueryCustomerControllerForOut() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		System.out.println("连接成功");
		String ID = request.getParameter("ID");
		String name = request.getParameter("name");
		CustomerDao customerDao = new CustomerDao();
		ArrayList<Customer> customers = new ArrayList<>();
		customers = customerDao.queryName(name);
		request.setAttribute("customer", customers);
		request.getRequestDispatcher("/queryCustomer3.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
