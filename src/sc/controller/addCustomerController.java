package sc.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sc.entity.Customer;
import sc.it.CustomerDao;

/**
 * Servlet implementation class addCustomerController
 */
@WebServlet("/addCustomerController")
public class addCustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addCustomerController() {
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
		System.out.println(name);
		String age = request.getParameter("age");
		if(age == "") age = "60";
		String sex = request.getParameter("sex");
		String idcard = request.getParameter("IDCARD");
		String recordID = request.getParameter("recordID");
		String elderType = request.getParameter("elderType");
		String checkinDate = request.getParameter("checkinDate");
		if(checkinDate == "") checkinDate = "0001-01-01";
		String expirationtionDate = request.getParameter("expirationtionDate");
		if(expirationtionDate == "") expirationtionDate = "0001-01-01";
		String contactTel = request.getParameter("contactTel");
		String height = request.getParameter("height");
		String birthday = request.getParameter("birthday");
		if(birthday == "") birthday = "0001-01-01";
		
		Customer customer = new Customer(name, Integer.parseInt(age), sex, idcard, recordID, elderType, checkinDate, expirationtionDate, contactTel, birthday, height);
		CustomerDao customerDao = new CustomerDao();
		boolean result = customerDao.insert(customer);
		String message = null;
		if(result){
			message = "添加客户信息成功";
		}else{
			message = "添加客户信息失败，请重新添加!";
		}
		request.setAttribute("msg", message);
		request.getRequestDispatcher("/AddCustomer.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
