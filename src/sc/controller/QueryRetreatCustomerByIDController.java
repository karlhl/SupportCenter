package sc.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sc.entity.Customer;
import sc.entity.RetreatCustomer;
import sc.it.CustomerDao;
import sc.it.RetreatCustomerDao;

/**
 * Servlet implementation class QueryRetreatCustomerByIDController
 */
@WebServlet("/QueryRetreatCustomerByIDController")
public class QueryRetreatCustomerByIDController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QueryRetreatCustomerByIDController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String ID = request.getParameter("ID");
		RetreatCustomerDao retreatCustomerDao = new RetreatCustomerDao();
		ArrayList<RetreatCustomer> retreatCustomers = new ArrayList<>();
		retreatCustomers = retreatCustomerDao.queryRetreatByID(Integer.valueOf(ID));
		request.setAttribute("retreatCustomers",retreatCustomers);
		request.getRequestDispatcher("/updateRetreatCustomer.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
