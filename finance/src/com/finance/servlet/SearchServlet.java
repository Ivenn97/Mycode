package com.finance.servlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.finance.entity.PlannerInfo;
import com.finance.service.PlannerInfoService;

@WebServlet("/SearchServlet")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       doPost(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		
		String flag=request.getParameter("search");
		System.out.println(flag);
		
		
	    PlannerInfoService plannerInfoService=new PlannerInfoService();
	        
		    if(plannerInfoService.searchByName(flag) != null){
		    	//如果不为空，则将其保存到域
		    	request.setAttribute("Name", plannerInfoService.searchByName(flag));
		    	//内部跳转  name.jsp，进行下一步的处理
		    	request.getRequestDispatcher("name.jsp").forward(request, response);
		    }else{
		    	if(plannerInfoService.searchByPhone(flag) != null){
		    		//如果不为空，则将其保存到域
		    		request.setAttribute("Phone", plannerInfoService.searchByPhone(flag));
		    		//内部跳转  phone.jsp，进行下一步的处理
		    		request.getRequestDispatcher("phone.jsp").forward(request, response);
		    	}else{
		    		if(plannerInfoService.searchByCompany(flag) != null){
		    			//如果不为空，则将其保存到域
		    			request.setAttribute("Company", plannerInfoService.searchByCompany(flag));
		    			//内部跳转  company.jsp，进行下一步的处理
		    			request.getRequestDispatcher("company.jsp").forward(request, response);
		    		}else {
						request.getRequestDispatcher("sorry.jsp").forward(request, response);
						
					}
		    	}
			}
	}
}
