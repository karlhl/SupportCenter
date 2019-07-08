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
 * Servlet implementation class NursingAddController
 */
@WebServlet("/NursingAddController")
public class NursingAddController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NursingAddController() {
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
		
		System.out.println(ID);
		NursingDao nd = new NursingDao();
		NursingRecord nr = new NursingRecord(ID,CUSTOMER_ID,CONTENT_ID,NURSING_TIME,NURSING_COUNT,STAFFINFO_ID,NURSING_ID);
		
		
		boolean result = nd.insert(nr);
		String message = null;
		if(result==true) {
			message = "success";
			
		}else {
			message = "false";
		}
		request.setAttribute("msg", message);//将java中的message字符串存储到request中，起名msg
		request.getRequestDispatcher("/addNursingRecord.jsp").forward(request, response);
		
		
		
		
		
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
