package sc.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sc.entity.RetreatCustomer;
import sc.it.RetreatCustomerDao;

/**
 * Servlet implementation class AddRetreatCustomer
 */
@WebServlet("/AddRetreatCustomer")
public class AddRetreatCustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddRetreatCustomer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String customerID = request.getParameter("customerID");
		String retreatTime = request.getParameter("retreatTime");
		if(retreatTime == "") retreatTime = "0001-01-01";
		String reason = request.getParameter("reason");
		String describe = request.getParameter("describe");
		String askTime = request.getParameter("askTime");
		if(askTime == "") askTime ="0001-01-01";
		
		RetreatCustomer retreatCustomer = new RetreatCustomer(Integer.parseInt(customerID), retreatTime, reason, describe, askTime);
		System.out.println(retreatCustomer);
		RetreatCustomerDao retreatCustomerDao = new RetreatCustomerDao();
		boolean result = retreatCustomerDao.insert(retreatCustomer);
		String message = null;
		if(result){
			message = "添加退宿信息成功";
		}else{
			message = "添加退宿信息失败!";
		}
		request.setAttribute("msg", message);
		request.getRequestDispatcher("/addRetreatCustomer.jsp").forward(request, response);
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
