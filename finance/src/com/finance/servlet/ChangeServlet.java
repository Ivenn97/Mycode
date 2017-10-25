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

/**
 * Servlet implementation class ChangeServlet
 */
@WebServlet("/ChangeServlet")
public class ChangeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	     doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		PlannerInfo plannerInfo=new PlannerInfo();
		/*Map<String, String[]> map = request.getParameterMap();
		Set<Entry<String, String[]>> set = map.entrySet();
		for (Entry<String, String[]> entry : set) {
			System.out.println(entry.getKey() + ":" + entry.getValue().toString());
		}
		try {
			//BeanUtils.populate(plannerInfo, map);
			BeanUtils.copyProperties(plannerInfo, map);
			System.out.println(plannerInfo.toString());
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		try {
			BeanUtils.populate(plannerInfo,request.getParameterMap());
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        PlannerInfoService plannerInfoService=new PlannerInfoService();
        plannerInfoService.change(plannerInfo);
        
        
        //内部跳转到LoadPlannerInfoServlet
        request.getRequestDispatcher("LoadPlannerInfoServlet").forward(request,response);
        
	}

}
