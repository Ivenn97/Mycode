package com.ssh.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="tb_role")
public class Role {
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   @Column(name="role_id")
   private Integer roleId;
   @Column(name="role_name")
   private String roleName;
   
   @ManyToMany
   @JoinTable(name="tb_user_role",joinColumns= {@JoinColumn(name="user_idd",referencedColumnName="user_id")},
	   inverseJoinColumns= {@JoinColumn(name="role_idd",referencedColumnName="role_id")}
			)
   private Set<Role> roles;

public Integer getRoleId() {
	return roleId;
}

public void setRoleId(Integer roleId) {
	this.roleId = roleId;
}

public String getRoleName() {
	return roleName;
}

public void setRoleName(String roleName) {
	this.roleName = roleName;
}
   
}
