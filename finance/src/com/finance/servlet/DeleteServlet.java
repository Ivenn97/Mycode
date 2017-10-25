package com.finance.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.finance.entity.PlannerInfo;
import com.finance.service.PlannerInfoService;

/**
 * Servlet implementation class DeleteServlet
 */
@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  doPost(request, response);
	  
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String id=request.getParameter("id");
		PlannerInfo plannerInfo=new PlannerInfo();
		plannerInfo.setId(id);
		PlannerInfoService plannerInfoService=new PlannerInfoService();
		plannerInfoService.delete(plannerInfo);
		
		//内部跳转到   LoadPlannerInfoServlet 类
		request.getRequestDispatcher("LoadPlannerInfoServlet").forward(request, response);
		

		
	}
	
	
	

}
