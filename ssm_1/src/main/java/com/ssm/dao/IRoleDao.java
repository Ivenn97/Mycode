package com.ssm.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.ssm.model.Role;
import com.ssm.model.User;
@Repository
public interface IRoleDao {
    
    public void insertRole(Role role);
    public Map selectRole();
    public Map selectRole2();
    public Role selectRoleById(Integer id);
    public List<Role> selectRole3();
    public List<Role> selectRole4();
}
