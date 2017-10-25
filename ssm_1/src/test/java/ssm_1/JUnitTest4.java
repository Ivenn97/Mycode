package ssm_1;


import javax.annotation.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ssm.service.IUserService;
import com.ssm.util.PageHelper;

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class JUnitTest4 {
   
	@Resource
	private IUserService userService;
	
	@Test
	public void test1() {
		userService.doinsertUser();
	}
	
	@Test
	public void test2() {
		PageHelper page = new PageHelper(5);
		userService.doselectUserByPage(page);
	}
	


}
