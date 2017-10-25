package ssm_1;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.ssm.dao.IRoleDao;
import com.ssm.dao.IUserDao;
import com.ssm.model.Role;
import com.ssm.model.User;
import com.ssm.util.MybatisUtil;

public class JUnitTest3 {

	@Test
	public void test1() {
		SqlSession session = MybatisUtil.openSession();
		
		IUserDao userDao = session.getMapper(IUserDao.class);
		List<User> list=  userDao.selectUser7("admin",1);
		System.out.println(list.size());
	}
	
	
	
	@Test
	public void test2() {
		SqlSession session = MybatisUtil.openSession();
		
		IUserDao userDao = session.getMapper(IUserDao.class);
		userDao.updateUser(1,"admin222",1);
	    session.commit();
	}
	
	@Test
	//模糊查询的测试
	public void test3() {
		SqlSession session = MybatisUtil.openSession();
		
		IUserDao userDao = session.getMapper(IUserDao.class);
		List<User> list = userDao.selectUser8("min22");
	    
	}


}
