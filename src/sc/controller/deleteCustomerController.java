package sc.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sc.it.CustomerDao;
import sc.entity.Customer;

import com.sun.org.apache.xml.internal.serializer.utils.SystemIDResolver;

/**
 * Servlet implementation class deleteCustomerController
 */
@WebServlet("/deleteCustomerController")
public class deleteCustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public deleteCustomerController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String ID = request.getParameter("ID");
		System.out.println(ID);
		Customer customer = new Customer();
		customer.setID(Integer.valueOf(ID));
		CustomerDao customerDao = new CustomerDao();
		customerDao.delete(customer);
		response.sendRedirect("/SupportCenter//queryCustomerController");  
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
