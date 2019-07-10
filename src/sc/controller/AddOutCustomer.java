package sc.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sc.entity.OutCustomer;
import sc.it.OutCustomerDao;

/**
 * Servlet implementation class AddOutCustomer
 */
@WebServlet("/AddOutCustomer")
public class AddOutCustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddOutCustomer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		System.out.println("添加外出信息连接成功");
		String customerID = request.getParameter("customerID");
		String outgoingReason = request.getParameter("outgoingReason");
		String outgoingTime = request.getParameter("outgoingTime");
		if(outgoingTime == "") outgoingTime ="0001-01-01";
		String expectedReturnTime = request.getParameter("expectedReturnTime");
		if(expectedReturnTime == "") expectedReturnTime ="0001-01-01";
		String actualReturnTime = request.getParameter("actualReturnTime");	
		if(actualReturnTime == "") actualReturnTime = "0001-01-01";
		String escorted = request.getParameter("escorted");
		String relation = request.getParameter("relation");
		String escortedTel = request.getParameter("escortedTel");
		OutCustomerDao outCustomerDao = new OutCustomerDao();
		OutCustomer outCustomer = new OutCustomer(Integer.parseInt(customerID), outgoingReason, outgoingTime, expectedReturnTime, actualReturnTime, escorted, relation, escortedTel);
		System.out.println(outCustomer);
		boolean result = outCustomerDao.insert(outCustomer);
		String message = null;
		if(result){
			message = "添加外出信息成功";
		}else{
			message = "添加外出信息失败!";
		}
		request.setAttribute("msg", message);
		request.getRequestDispatcher("/addOutCustomer.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
