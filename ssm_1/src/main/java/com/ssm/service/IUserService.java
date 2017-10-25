package com.ssm.service;

import java.util.List;

import com.ssm.model.User;
import com.ssm.util.PageHelper;

public interface IUserService {
	public void doinsertUser();
	
	public void doselectUserByPage(PageHelper page);
}
