package com.ssm.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Request;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ssm.model.UserList;

@Controller
@RequestMapping("/user2")
public class UserController2 {

	
	/*直接List<User> list 是不能接收参数的
	public String getList(List<User> list) {
		System.out.println(users.getUsers().size());
		return "index";
	}*/
	@RequestMapping("/getList")
	public String getList(UserList users) {
		System.out.println(users.getUsers().size());
		return "index";
	}
	
	
	@RequestMapping("/getSet")
	public String getSet(UserList users2) {
		System.out.println(users2.getUsers2().size());
		return "index";
	}
	
	
	@RequestMapping("/getMap")
	public String getMap(UserList map) {
		System.out.println(map.getMap().get("k").getUserName());
		return "index";
	}
	
	
	@RequestMapping(value="/getannotation",method = {RequestMethod.GET})
	public String annotation(UserList map) {
		System.out.println(map.getMap().get("k").getUserName());
		return "index";
	}
	
	@RequestMapping("/getCookie")
	//使用Cookies的注解，可以不用再对Cookies进行遍历
	public String getCookie(@CookieValue("JSESSIONID") String userName) {
		System.out.println("------"+userName);
		return "index";
	}
	
	@RequestMapping("/getCookie1")
	//使用Cookies的注解，可以把强制
	public String getCookie1(@CookieValue(required=false,name="kkk") String userName) {
		System.out.println("------"+userName);
		return "index";
	}
	
	
	@RequestMapping("/getannotation1")
	//显示配置参数一定要指定参数名,但是可以用required=false  把强制去掉
	public String annotation1(@RequestParam(name="userName2",required=false) String userName) {
		System.out.println("------"+userName);
		return "index";
	}
	

	@RequestMapping("/getHeader")
	//可以获取响应头的信息
	public String getHeader(@RequestHeader("User-Agent") String userName) {
		System.out.println("------"+userName);
		return "index";
	}
	
	
	
	@RequestMapping("/{userId}/FrendsList")
	//
	public String getFrendsList(@PathVariable(name="userId") Integer userId) {
		System.out.println("------"+userId);
		return "index";
	}
}
