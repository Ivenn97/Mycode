package com.finance.service;

import com.finance.dao.imp.PlannerInfoDao;
import com.finance.entity.PlannerInfo;

public class PlannerInfoService {
	public void add(PlannerInfo plannerInfo){
		PlannerInfoDao plannerInfoDao=new PlannerInfoDao();
		plannerInfoDao.addAll(plannerInfo);
    }

	public PlannerInfo getOneById(String str) {
		PlannerInfoDao plannerInfoDao=new PlannerInfoDao();
		return plannerInfoDao.getOneById(str);
	}

	public int change(PlannerInfo plannerInfo) {
		return new PlannerInfoDao().change(plannerInfo);
		
	}

	public void delete(PlannerInfo plannerInfo) {
		PlannerInfoDao plannerInfoDao=new PlannerInfoDao();
		plannerInfoDao.delete(plannerInfo);
	}
	public PlannerInfo  searchByName(String name){
		 return  new PlannerInfoDao().getPlannerInfoByName(name);
	}

	

	public PlannerInfo searchByPhone(String phone) {
		
		return new PlannerInfoDao().getPlannerInfoByPhone(phone);
	}

     public PlannerInfo searchByCompany(String company) {
		
		return new PlannerInfoDao().getPlannerInfoByCompany(company);
	}

	
	
}
