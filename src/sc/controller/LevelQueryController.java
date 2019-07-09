package sc.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import sc.entity.CareLevel;
import sc.it.CareLevelDao;

/**
 * Servlet implementation class LevelQueryController
 */
@WebServlet("/LevelQueryController")
public class LevelQueryController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LevelQueryController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		String flag = request.getParameter("flag");
		CareLevelDao cd = new CareLevelDao();
		if(id!=null&&!id.equals("")) {
			CareLevel c = cd.queryByID(id);
			System.out.println(c);
			
			ArrayList<CareLevel> CareLevels = new ArrayList<>();
			CareLevels.add(c);
			request.setAttribute("CareLevel", CareLevels);
		}else {
			ArrayList<CareLevel> CareLevels = cd.queryAll();
			request.setAttribute("CareLevel", CareLevels);
		}
		if(flag == null) {
			request.getRequestDispatcher("/queryCareLevel.jsp").forward(request,response);
		}else if(flag.contentEquals("update")){
			request.getRequestDispatcher("/updateCareLevel.jsp").forward(request,response);
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
