package sc.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sc.it.CustomerDao;
import sc.entity.Customer;


/**
 * Servlet implementation class queryCustomerByIDController
 */
@WebServlet("/queryCustomerByIDController")
public class queryCustomerByIDController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public queryCustomerByIDController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String ID = request.getParameter("ID");
		CustomerDao customerDao = new CustomerDao();
		ArrayList<Customer> customers = new ArrayList<>();
		customers = customerDao.queryByID(Integer.valueOf(ID));
		request.setAttribute("customer", customers);
		request.getRequestDispatcher("/updateCustomer.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
