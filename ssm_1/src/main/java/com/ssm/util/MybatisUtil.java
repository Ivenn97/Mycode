package com.ssm.util;

import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MybatisUtil {
    private static SqlSessionFactory factory;
    
    private static String resource = "mybatis-config.xml";
    
    private static InputStream inputStream;
    
    private static ThreadLocal<SqlSession> t = new ThreadLocal<SqlSession>();
    
    private static Logger log = LogManager.getLogger("MybatisUtil.class");
    
    static {
    	try {
			inputStream = Resources.getResourceAsStream(resource);
			factory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    
    
    public static SqlSession openSession() {
    	log.info("openSession方法正常");
    	return factory.openSession();
    	
    }
    
    public static SqlSession getSession() {
    	if(t.get()==null) {
    		t.set(factory.openSession());
    	}
    	log.info("getSession方法正常");
    	return t.get();
    }
    
    public  static void close(SqlSession sqlSession) {
    	t.set(null);
    	log.info("close方法正常");
    	sqlSession.close();
    }
}
