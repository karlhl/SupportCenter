package sc.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sc.entity.NursingRecord;
import sc.it.NursingDao;

/**
 * Servlet implementation class NursingUpdateController
 */
@WebServlet("/NursingUpdateController")
public class NursingUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NursingUpdateController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String ID = request.getParameter("ID");
		String CUSTOMER_ID = request.getParameter("CUSTOMER_ID");
		String CONTENT_ID = request.getParameter("CONTENT_ID");
		String NURSING_TIME = request.getParameter("NURSING_TIME");
		String NURSING_COUNT = request.getParameter("NURSING_COUNT");
		String STAFFINFO_ID = request.getParameter("STAFFINFO_ID");
		String NURSING_ID = request.getParameter("NURSING_ID");
		
		System.out.println("连接成功");
		NursingDao nd = new NursingDao();
		NursingRecord nr = new NursingRecord(ID,CUSTOMER_ID,CONTENT_ID,NURSING_TIME,NURSING_COUNT,STAFFINFO_ID,NURSING_ID);
		
		nd.update(nr);
		response.sendRedirect("/SupportCenter/NursingQueryController");//重定向，不传数据
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
