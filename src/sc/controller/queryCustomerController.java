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
 * Servlet implementation class queryCustomerController
 */
@WebServlet("/queryCustomerController")
public class queryCustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public queryCustomerController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
	
		String ID = request.getParameter("ID");
		String name = request.getParameter("name");
		System.out.println(name);
		CustomerDao customerDao = new CustomerDao();
		if(name != null && !(name.equals(""))){
		ArrayList<Customer> customers = new ArrayList<>();
		customers = customerDao.queryName(name);
		for (Customer customer : customers) {
			System.out.println(customer);
		}
		request.setAttribute("customer", customers);
		}else{
			//��ѯȫ����Ϣ
			ArrayList<Customer> customers = customerDao.queryAll();
			request.setAttribute("customer",customers);
			
		}
		request.getRequestDispatcher("/queryCustomer.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
