package com.finance.dao.imp;

import java.sql.SQLException;
import java.util.List;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import com.finance.dao.IPlannerInfoDao;
import com.finance.entity.PlannerInfo;
import com.finance.utils.JdbcUtils;

public class PlannerInfoDao implements IPlannerInfoDao {
	public  List<PlannerInfo> getAll() {
		String sql = "select * from plannerinfo where status=0";
		try {
		return  JdbcUtils.getQueryRunner()
					.query(sql,new BeanListHandler<PlannerInfo>(PlannerInfo.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public PlannerInfo getPlannerInfoByName(String name) {
		String sql = "select * from plannerinfo where name=?";
		
		try {
			return JdbcUtils.getQueryRunner().query(sql,new BeanHandler<PlannerInfo>(PlannerInfo.class),name);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public PlannerInfo getPlannerInfoByPhone(String phone) {
        String sql = "select * from plannerinfo where phone=?";
		
		try {
			return JdbcUtils.getQueryRunner().query(sql,new BeanHandler<PlannerInfo>(PlannerInfo.class),phone);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public PlannerInfo getPlannerInfoByCompany(String company) {
        String sql = "select * from plannerinfo where company=?";
		try {
			return JdbcUtils.getQueryRunner().query(sql,new BeanHandler<PlannerInfo>(PlannerInfo.class),company);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return null;
	}

	@Override
	public void updateAll(PlannerInfo plannerInfo) {
		String sql ="update plannerinfo set name=?,phone=?,company=?,ps=?,position=?,photo_url=? where id=?";

		try {
			JdbcUtils.getQueryRunner().update(sql,plannerInfo.getName(),plannerInfo.getPhone(),plannerInfo.getCompany(),plannerInfo.getPs(),plannerInfo.getPosition(),plannerInfo.getPhoto_url(),plannerInfo.getId());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void addAll(PlannerInfo plannerInfo) {
		String sql="insert into plannerinfo(name,phone,company,photo_url,ps,status,position) value(?,?,?,?,?,?,?)";
		try {
			JdbcUtils.getQueryRunner().update(sql,plannerInfo.getName(),plannerInfo.getPhone(),plannerInfo.getCompany(),plannerInfo.getPhoto_url(),plannerInfo.getPs(),plannerInfo.getStatus(),plannerInfo.getPosition());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void delete(PlannerInfo plannerInfo) {
		String sql="update plannerinfo set status=1 where id=?";
		try {
			JdbcUtils.getQueryRunner().update(sql,plannerInfo.getId());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public PlannerInfo getOneById(String str) {
		String sql = "select * from plannerinfo where id=?";
		try {
		return  JdbcUtils.getQueryRunner()
					.query(sql, new BeanHandler<>(PlannerInfo.class),str);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
		
	}

	public int change(PlannerInfo plannerInfo) {
		String sql = "update plannerinfo set name=?,phone=?,company=?,ps=?,position=? where id=?";
		try {
			return  JdbcUtils.getQueryRunner()
						.update(sql,plannerInfo.getName(),plannerInfo.getPhone(),plannerInfo.getCompany(),plannerInfo.getPs(),plannerInfo.getPosition(),plannerInfo.getId());
			} catch (SQLException e) {
				e.printStackTrace();
			}
		return 0;
			
	}


}


