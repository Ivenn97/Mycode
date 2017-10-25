package ssm_1;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import com.ssm.dao.IUserDao;
import com.ssm.model.User;
import com.ssm.util.MybatisUtil;

public class JUnitTest {

	@Test
	public void test() {
		SqlSession session = MybatisUtil.openSession();
		
		
		//方式一(不推荐)
		//List<User> list2 = session.selectList("com.ssm.dao.IUserDao.selectUser");
		//System.out.println(list2.size());
		
		
		//方式二(重点掌握)
		IUserDao userDao = session.getMapper(IUserDao.class);//把配置文件与Dao接口进行映射
		List<User> list = userDao.selectUser();
		System.out.println(list.size());
		System.out.println(list.get(0).getUserName());
	}
	
	
	@Test
	public void test2() {
		SqlSession session = MybatisUtil.openSession();
		
		//方式二(重点掌握)
		IUserDao userDao = session.getMapper(IUserDao.class);
		//User user  = (User) userDao.selectUserById(1);
		//System.out.println(user.getUserName());
		
		/*User temp = new User();
		temp.setUserId(1);
		User u1 = userDao.selectUserByParam(temp);
		System.out.println(u1.getUserName());*/
		
		//删除
		//User user  =  (User) userDao.selectUserById(1);
		//userDao.deleteUserById(user);
		
		MybatisUtil.close(session);
		
		//测试二级缓存                           
        /*SqlSession session2 = MybatisUtil.openSession();
		IUserDao userDao2 = session2.getMapper(IUserDao.class);
		User u2= userDao2.selectUserByParam(temp);
		System.out.println(u2.getUserName());
		MybatisUtil.close(session2);*/
		
	}
	
	@Test
	//使用数据库的自增策略的方法的测试
	public void test3() {
		SqlSession session = MybatisUtil.openSession();
		IUserDao userDao = session.getMapper(IUserDao.class);
		
		User user = new User();
		user.setUserName("admin333");
		userDao.insertUser(user);
		System.out.println(user.getUserId());
		
		session.commit();
		MybatisUtil.close(session);
	}

	@Test
	//使用自定义的自增策略的方法的测试
	public void test4() {
		SqlSession session = MybatisUtil.openSession();
		IUserDao userDao = session.getMapper(IUserDao.class);
		
		User user = new User();
		user.setUserName("admin444");
		userDao.insertUser2(user);
		System.out.println(user.getUserId());
		
		session.commit();
		MybatisUtil.close(session);
	}
	
	@Test
	//更新的测试
	public void test5() {
		SqlSession session = MybatisUtil.openSession();
		IUserDao userDao = session.getMapper(IUserDao.class);
	
		//userDao.updateUser("admin55", 3);
		session.commit();
		MybatisUtil.close(session);
	}
	
	@Test
	//自定义映射的测试
	public void test6() {
		SqlSession session = MybatisUtil.openSession();
		IUserDao userDao = session.getMapper(IUserDao.class);
	   
		List<User> list = userDao.selectUser();
	    System.out.println(list.size());
		MybatisUtil.close(session);
	}
	
	
	@Test
	//自定义映射的测试
	public void test7() {
		SqlSession session = MybatisUtil.openSession();
		IUserDao userDao = session.getMapper(IUserDao.class);
	   
		
		
		MybatisUtil.close(session);
	}
	
}
