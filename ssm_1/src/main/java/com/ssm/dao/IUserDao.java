package com.ssm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.ssm.model.Role;
import com.ssm.model.User;
import com.ssm.util.PageHelper;

public interface IUserDao {
	
   public List<User> selectUser();
	
   public List<User> selectUser6();
   //配置文件里获取的参数名可以不与接口的参数名一致，但最好保持一致，方便阅读(即如果单独是实体类的某个属性的话可以不一致)
   public List<User> selectUserById(Integer id);
   //配置文件里面的#{userId}的获取参数名必须与实体类的参数名一致(即如果是传入实体类的话，其中的属性名要和传入的参数名一致)
   public User selectUserByParam(User user);
   
   public void deleteUserById(Integer id);
   
   public void insertUser(User user);
   public void insertUser2(User user);
   
   
//   public Role selectRoleById(Integer id);
   
  /* public List<User> selectUserByRoleId(Integer id);*/
   
   //public void updateUser(User user);
   //public void updateUser(Map user);//多表参数传入时，可以考虑使用（经常使用）
   //5个参数以内可以考虑使用
   public void updateUser(@Param("roleId") Integer roleId,@Param("userName") String userName,@Param("userId") Integer userId);
   
   
   public List<User> selectUser7(@Param("userName") String userName,@Param("roleId") Integer userId);
   
   public List<User> selectUser8(@Param("userName") String userName);
   
   
   public Long countUser();
   public List<User> selectUserByPage(PageHelper page);
   
   
   
}
