package sc.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sc.entity.CareLevel;
import sc.it.CareLevelDao;

/**
 * Servlet implementation class LevelAddController
 */
@WebServlet("/LevelAddController")
public class LevelAddController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LevelAddController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String status = request.getParameter("status");
		
		
		CareLevelDao cd = new CareLevelDao();
		
		
		CareLevel c = new CareLevel(id,name,Integer.parseInt(status));
		System.out.println(c);
		
		boolean result = cd.insert(c);
		String message = null;
		if(result==true) {
			message = "success";
			
		}else {
			message = "false";
		}
		request.setAttribute("msg", message);//将java中的message字符串存储到request中，起名msg
		request.getRequestDispatcher("/addCareLevel.jsp").forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
