package sc.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sc.it.CustomerDao;
import sc.entity.Customer;


/**
 * Servlet implementation class updateCustomerController
 */
@WebServlet("/updateCustomerController")
public class updateCustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateCustomerController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String iD = request.getParameter("id");
		System.out.println(iD);
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String sex = request.getParameter("sex");
		String iDCARD = request.getParameter("IDCARD");
		String recordID = request.getParameter("recordID");
		String elderType = request.getParameter("elderType");
		String checkInDate = request.getParameter("checkInDate");
		String expirationtionDate = request.getParameter("expirationtionDate");
		String contactTel = request.getParameter("contactTel");
		String birthday = request.getParameter("birthday");
		String height = request.getParameter("height");
		Customer customer = new Customer(name, Integer.parseInt(age), sex, iDCARD, recordID, elderType, checkInDate, expirationtionDate, contactTel, birthday, height);
		customer.setID(Integer.valueOf(iD));
		CustomerDao customerDao = new CustomerDao();
		customerDao.update(customer);
		System.out.println(customer);
		response.sendRedirect("/SupportCenter/queryCustomerController"); 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
