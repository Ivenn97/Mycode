package com.finance.dao.imp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.finance.entity.PlannerInfo;

public class Test {
     public static void main(String[] args) {
		  PlannerInfoDao plannerInfoDao=new PlannerInfoDao();
//		  System.out.println(iPlannerInfo.getAll());
		  List<PlannerInfo> plannerInfos=new ArrayList<PlannerInfo>();
		  plannerInfos= (List<PlannerInfo>)plannerInfoDao.getAll();
		  Iterator iterator =  plannerInfos.iterator();
		  while(iterator.hasNext()){
			 PlannerInfo plannerInfo =(PlannerInfo) iterator.next();
	//		 System.out.println(plannerInfo.getName());
		  }
		  System.out.println(plannerInfoDao.getPlannerInfoByName("小明").getName());
		  PlannerInfo plannerInfo=new PlannerInfo();
		  plannerInfo.setName("发货");
		  plannerInfo.setPhone("12372564251");
		  plannerInfo.setCompany("淘宝");
		  plannerInfo.setPs("dfa");
		  plannerInfo.setPosition("总经理");
		  plannerInfo.setPhoto_url("/finance.2.jpg");
		  plannerInfo.setId("1");
		  plannerInfoDao.updateAll(plannerInfo);
		  
		  
		  
	}
     
}
