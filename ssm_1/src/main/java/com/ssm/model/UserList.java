package com.ssm.model;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UserList {
	//set集合在jsp文件的获取方式    users2[0].userName
	private Set<User> users2 = new HashSet<User>();
	public UserList() {
		users2.add(new User());
		users2.add(new User());
	}
	public Set<User> getUsers2() {
		return users2;
	}
	public void setUsers2(Set<User> users2) {
		this.users2 = users2;
	}

	
	//list集合在jsp文件的获取方式    users[0].userName
	private List<User> users;
	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	//map集合在jsp文件的获取方式    map['k'].userName
	private Map<String,User> map;
	public Map<String, User> getMap() {
		return map;
	}

	public void setMap(Map<String, User> map) {
		this.map = map;
	}
	
 	private String company;
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
}
