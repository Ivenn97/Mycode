package com.finance.servlet;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.finance.entity.PlannerInfo;
import com.finance.service.PlannerInfoService;


@WebServlet("/AddInfoServlet")
@MultipartConfig
public class AddInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L ;
	String s1=null;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String flag = request.getParameter("flag");
		if(flag!=null){
		  if("add".equals(flag)){
			add(request, response);
			
		  }
		}else{
			Part part = request.getPart("inputFile");
			String line = part.getHeader("Content-Disposition");
			String filename = line.substring(line.indexOf("filename=\"")+10,line.length()-1);
			String savepath = request.getServletContext().getInitParameter("src");//创建保存目录
			//这一步就是保存文件到制定的路径
			File file = new File(savepath);
			if(!file.exists()){
				file.mkdir();
			}

			String filenameEnd = UUID.randomUUID()+"_"+filename;
			part.write(savepath+"/"+filenameEnd);
			PrintWriter p = response.getWriter();
			s1 = "images/"+filenameEnd;
			p.println(s1);
			p.close();
		}
	}
	
	public void add(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		
		String Name = request.getParameter("name");
		String Phone = request.getParameter("phone");
		String Company = request.getParameter("company");
		String Ps = request.getParameter("ps");
		String Status = request.getParameter("status");
		String Position = request.getParameter("position");
		System.out.println(Phone);
		String Photo_url = s1;
		

		PlannerInfo plannerInfo = new PlannerInfo();
		plannerInfo.setName(Name);
		plannerInfo.setPhone(Phone);
		plannerInfo.setCompany(Company);
		plannerInfo.setPs(Ps);
		plannerInfo.setStatus(Status);
		plannerInfo.setPosition(Position);
		plannerInfo.setPhoto_url(Photo_url);
		plannerInfo.setLast_change(new Date());
		plannerInfo.setCreate_time(new Date());

		PlannerInfoService plannerInfoService = new PlannerInfoService();
		plannerInfoService.add(plannerInfo);
        
		//内部跳转到   LoadPlannerInfoServlet 类
		request.getRequestDispatcher("LoadPlannerInfoServlet").forward(request, response);
		

	}

}
