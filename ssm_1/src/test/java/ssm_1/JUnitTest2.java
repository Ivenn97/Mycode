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

public class JUnitTest2 {

	@Test
	public void test() {
		SqlSession session = MybatisUtil.openSession();
		IRoleDao roleDao = session.getMapper(IRoleDao.class);
		Map map =  roleDao.selectRole();
		System.out.println(map.get("id"));
	}
	
	@Test
	//懒加载的测试
	public void test1() {
		SqlSession session = MybatisUtil.openSession();
		
		IUserDao userDao = session.getMapper(IUserDao.class);
		List<User> list=  userDao.selectUser();
		
		session.close();
		System.out.println(list.get(0).getUserName());
	}

	@Test
	//一对多的测试
	public void test2() {
		SqlSession session = MybatisUtil.openSession();
		
		IRoleDao roleDao = session.getMapper(IRoleDao.class);
		List<Role> list=  roleDao.selectRole3();
		System.out.println(list.size());
	}
	
	@Test
	//多对多的测试
	public void test3() {
		SqlSession session = MybatisUtil.openSession();
		
		IUserDao userDao = session.getMapper(IUserDao.class);
		List<User> list=  userDao.selectUser6();
		System.out.println(list.size());
	}

	
}
