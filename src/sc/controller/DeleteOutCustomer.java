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
 * Servlet implementation class DeleteOutCustomer
 */
@WebServlet("/DeleteOutCustomer")
public class DeleteOutCustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteOutCustomer() {
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
		OutCustomer outCustomer = new OutCustomer();
		outCustomer.setID(Integer.parseInt(ID));
		OutCustomerDao outCustomerDao = new OutCustomerDao();
		outCustomerDao.delete(outCustomer);
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
