package com.finance.entity;

import java.util.Date;

public class PlannerInfo {
    private String id;
    private String name;
    private String phone;
    private String company;
    private String photo_url;
    private String ps;
    private Date create_time;
    private Date last_change;
    private String status;
    private String position;
	public PlannerInfo() {
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getPhoto_url() {
		return photo_url;
	}
	public void setPhoto_url(String photo_url) {
		this.photo_url = photo_url;
	}
	public String getPs() {
		return ps;
	}
	public void setPs(String ps) {
		this.ps = ps;
	}
	
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public Date getLast_change() {
		return last_change;
	}
	public void setLast_change(Date last_change) {
		this.last_change = last_change;
	}
	public String  getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	@Override
	public String toString() {
		return "PlannerInfo [id=" + id + ", name=" + name + ", phone=" + phone + ", company=" + company + ", photo_url="
				+ photo_url + ", ps=" + ps + ", create_time=" + create_time + ", last_change=" + last_change
				+ ", status=" + status + ", position=" + position + "]";
	}
	
    
}
