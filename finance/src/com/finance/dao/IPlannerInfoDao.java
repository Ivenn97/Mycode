package com.finance.dao;

import com.finance.entity.PlannerInfo;

public interface IPlannerInfoDao {
   
     public PlannerInfo getPlannerInfoByName(String name);
     public PlannerInfo getPlannerInfoByPhone(String phone);
     public PlannerInfo getPlannerInfoByCompany(String company);
     public void updateAll(PlannerInfo plannerInfo);
     public void addAll(PlannerInfo plannerInfo);
     public void delete(PlannerInfo plannerInfo);

}
