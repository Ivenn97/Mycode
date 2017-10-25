package com.finance.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.finance.dao.imp.PlannerInfoDao;
import com.finance.entity.PlannerInfo;


@WebServlet("/LoadPlannerInfoServlet")
public class LoadPlannerInfoServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PlannerInfoDao plannerInfoDao=new PlannerInfoDao();
		List<PlannerInfo> plannerinfos  =(List<PlannerInfo>)plannerInfoDao.getAll();
        ServletContext context = request.getServletContext();      
	    context.setAttribute("plannerinfos", plannerinfos);
	    //内部跳转到    plannerinfo.jsp  文件
	    request.getRequestDispatcher("/plannerinfo.jsp").forward(request, response);
	    
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
