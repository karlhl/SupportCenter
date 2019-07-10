package sc.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sc.entity.OutCustomer;
import sc.it.OutCustomerDao;

/**
 * Servlet implementation class QueryOutCustomerByID
 */
@WebServlet("/QueryOutCustomerByID")
public class QueryOutCustomerByID extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QueryOutCustomerByID() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		System.out.println("查询外出信息连接成功");
		String ID = request.getParameter("ID");
		OutCustomerDao outCustomerDao = new OutCustomerDao();
		ArrayList<OutCustomer> outCustomers = new ArrayList<>();	
		outCustomers =  outCustomerDao.queryByID(Integer.parseInt(ID));
		request.setAttribute("outCustomers",outCustomers);
		request.getRequestDispatcher("/updateOutCustomer.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
