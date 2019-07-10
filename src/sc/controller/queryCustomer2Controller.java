package sc.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sc.entity.Customer;
import sc.it.*;;

/**
 * Servlet implementation class queryCustomerController
 */
@WebServlet("/queryCustomer2Controller")
public class queryCustomer2Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public queryCustomer2Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		System.out.println("���ӳɹ�");
		String name = request.getParameter("name");
		System.out.println(name);
		RetreatCustomerDao retreatCustomerDao = new RetreatCustomerDao();
		ArrayList<Customer> customers = new ArrayList<>();
		customers = retreatCustomerDao.queryCustomerNoRetreat(name);
		/*for (Customer customer : customers) {
			System.out.println(customer);
		}*/
		request.setAttribute("customer", customers);
		request.getRequestDispatcher("/queryCustomer2.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
