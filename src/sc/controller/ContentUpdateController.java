package sc.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sc.entity.CareContent;
import sc.it.ContentDao;

/**
 * Servlet implementation class ContentUpdateController
 */
@WebServlet("/ContentUpdateController")
public class ContentUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContentUpdateController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String cid = request.getParameter("cid");
		String serialNumber = request.getParameter("serialNumber");
		String nursingName = request.getParameter("nursingName");
		String servicePrice = request.getParameter("servicePrice");
		String describe = request.getParameter("describe");
		String incrementFlag = request.getParameter("incrementFlag");
		String status = request.getParameter("status");
		
		ContentDao cd = new ContentDao();
		CareContent c = new CareContent(cid,serialNumber,nursingName,servicePrice,describe,Integer.parseInt(incrementFlag),Integer.parseInt(status));
		cd.update(c);
		response.sendRedirect("/SupportCenter/ContentQueryConroller");//重定向，不传数据
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
