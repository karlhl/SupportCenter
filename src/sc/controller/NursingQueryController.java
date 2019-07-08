package sc.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sc.entity.CareContent;
import sc.entity.NursingRecord;
import sc.it.NursingDao;

/**
 * Servlet implementation class NursingQueryController
 */
@WebServlet("/NursingQueryController")
public class NursingQueryController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NursingQueryController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("CUSTOMER_ID");
		String flag = request.getParameter("flag");
		NursingDao nd = new NursingDao();
		
		if(id!=null&&id.equals("")) {
			ArrayList<NursingRecord> NursingRecords = nd.quaryByID(id);
			request.setAttribute("NursingRecord", NursingRecords);
			
		}else {
			ArrayList<NursingRecord> NursingRecords = nd.queryAll();
			request.setAttribute("NursingRecord", NursingRecords);
			
		}
		if(flag == null) {
			request.getRequestDispatcher("/queryNursingRecord.jsp").forward(request,response);
		}else if(flag.contentEquals("update")){
			request.getRequestDispatcher("/updateNursingRecord.jsp").forward(request,response);
		}
		
	
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
