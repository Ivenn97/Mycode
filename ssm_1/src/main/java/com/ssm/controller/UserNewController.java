package com.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssm.model.User;

@Controller
@RequestMapping("/userNew")
public class UserNewController {
   
	 @RequestMapping("/login")
	 public String login(ModelMap map,String userName) {
		 
		 System.out.println("名字是："+userName);
		 User user = new User();
		 user.setUserName(userName);
		 map.addAttribute("user",user);
		 return "index";
	 }
}
