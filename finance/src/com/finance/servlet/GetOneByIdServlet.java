package com.finance.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.finance.entity.PlannerInfo;
import com.finance.service.PlannerInfoService;



/**
 * Servlet implementation class GetOneByIdServelt
 */
@WebServlet("/GetOneByIdServlet")
public class GetOneByIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String str = request.getParameter("id");
		PlannerInfo plannerInfo=new PlannerInfoService().getOneById(str);
		request.setAttribute("plannerInfo", plannerInfo);
		
		//内部跳转到  change.jsp 文件
		request.getRequestDispatcher("change.jsp").forward(request, response);
		
		
	}

}
