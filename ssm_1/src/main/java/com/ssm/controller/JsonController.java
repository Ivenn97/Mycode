package com.ssm.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.ssm.model.User;
import com.ssm.model.UserList;

@Controller
@RequestMapping("/json")
public class JsonController {
	
       //默认直接输出一个字符串
	   @ResponseBody
	   @RequestMapping("/getStringJson")
	   public String getStringJson() {
		   return "index";
	   }
	   
	   //如果返回的是对象，springMvc需要用到json工具把对象再进一步的字符串转化为json格式的字符串
	   @ResponseBody
	   @RequestMapping("/getUserJson")
	   public User getUserJson() {
		   User user = new User();
		   user.setUserName("haha ");
		   return user;
	   }
	   
	   
	   @RequestMapping("/jsonToUser")
	   public String  jsonToUser(@RequestBody User user) {
		   System.out.println(user.getUserName());
		   return "index";
	   }
	   
	   
	   @RequestMapping("/jsonToList")
	   public String  jsonToList(@RequestBody List<User> list) {
		   System.out.println(list.size());
		   return "index";
	   }
	   
	   
	   
	   @RequestMapping("/normalGson")
	   public String  normalGson(String json) {
		   System.out.println(json);
		   Gson gson  = new Gson();
		   List<User> list = gson.fromJson(json, List.class);
		   System.out.println(list.size());
		   return "index";
	   }
	   
	   @RequestMapping("/jsonToUser2")
	   public String  jsonToUser2(@RequestBody UserList list) {
		   System.out.println(list.getUsers().get(0).getUserName());
		   
		   System.out.println(list.getCompany());
		   return "index";
	   }
	   
	   
}
