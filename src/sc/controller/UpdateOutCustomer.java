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
 * Servlet implementation class UpdateOutCustomer
 */
@WebServlet("/UpdateOutCustomer")
public class UpdateOutCustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateOutCustomer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String ID = request.getParameter("ID");
		System.out.println("更新外出信息连接");
		System.out.println(ID);
		String customerID = request.getParameter("customerID");
		System.out.println(customerID);
		String outgoingTime = request.getParameter("outgoingTime");
		String outgoingReason = request.getParameter("outgoingReason");
		String expectedReturnTime = request.getParameter("expectedReturnTime");
		String actualReturnTime = request.getParameter("actualReturnTime");
		String escorted = request.getParameter("escorted");
		String relation = request.getParameter("relation");
		String escortedTel = request.getParameter("escortedTel");
		OutCustomerDao outCustomerDao = new OutCustomerDao();
		OutCustomer outCustomer = new OutCustomer(Integer.parseInt(ID),Integer.parseInt(customerID),outgoingReason, outgoingTime, expectedReturnTime, actualReturnTime, escorted, relation, escortedTel);
		outCustomerDao.update(outCustomer);
		response.sendRedirect("/SupportCenter//QueryOutCustomer");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
