package com.ssm.service.impl;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ssm.dao.IUserDao;
import com.ssm.model.User;
import com.ssm.service.IUserService;
import com.ssm.util.PageHelper;

@Service
public class UserServiceImpl implements IUserService {
    
	@Resource
	private IUserDao userDao;

	@Override
	public void doinsertUser() {
		User user = new User();
		User user1 = new User();
		user.setUserName("sss1");
		user1.setUserName("sss2");
		userDao.insertUser(user);
		userDao.insertUser(user1);
	}

	@Override
	public void doselectUserByPage(PageHelper page) {
		Long  i = userDao.countUser();
		page.setTotalNum(i.intValue());
		List<User> list = userDao.selectUserByPage(page);
		System.out.println(list.size());
		
	}
	

}
