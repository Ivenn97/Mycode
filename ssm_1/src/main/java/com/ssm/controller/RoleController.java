package com.ssm.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ssm.model.User;

//Controller类一定是子容器（springmvc.xml）负责加载扫描的，父容器加载不了，它会优先使用自己的Controller类
@Controller
@RequestMapping("/role")//可以不加反斜杠
public class RoleController {
	
	@RequestMapping("/login")
    public ModelAndView login() {
        System.out.println("role_login");
        //反馈的方式一
    	//ModelAndView view = new ModelAndView("index");
        
        //反馈的方式二，同时传入对象
        ModelAndView view  =new ModelAndView();
        //指的是视图层的jsp的名字
        
        
        User user =new User();
        user.setUserName("user name ");
        view.addObject("user",user);
        view.setViewName("index");
        
        
    	return view;
    
    }
	
	@RequestMapping("/logout")
    public String logout(ModelMap modelmap,Map map ) {
        User user = new User();
        user.setUserName("user logout");
    	//方式一
        //modelmap.addAttribute("user",user);
    	
    	//方式二
        map.put("user", user);
        
    	return "index";
    
    }
	
	
	@RequestMapping("/logout1")
    public String logout1(HttpServletRequest request,HttpServletResponse response) {
        User user = new User();
        user.setUserName("user logout1");
    	request.setAttribute("user", user);
    	
    	//默认是内部跳转(forword)，可以修改为重定向(redirect)
    	return "redirect:index";
    
    }
}
