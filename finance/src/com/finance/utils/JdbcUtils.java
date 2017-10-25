package com.finance.utils;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class JdbcUtils {
	/**
	 * C3P0连接池的核心工具类
	 */
	private static DataSource dataSource;
	//静态初始化连接池
	static{
		dataSource = new ComboPooledDataSource();
	}
	
	/**
	 * Description:
	 * 初始化DbUtils核心工具类对象，并返回
	 * 
	 * @return 返回DbUtils核心工具类对象
	 */

	public static QueryRunner getQueryRunner(){
		//返回创建的QueryRuuner对象，并传入连接池对象
		return new QueryRunner(dataSource);
	}
	
}
